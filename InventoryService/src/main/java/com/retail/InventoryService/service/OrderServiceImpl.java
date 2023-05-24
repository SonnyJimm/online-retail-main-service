package com.retail.InventoryService.service;

import com.retail.InventoryService.domain.ItemLine;
import com.retail.InventoryService.domain.ItemQuantity;
import com.retail.InventoryService.domain.Order;
import com.retail.InventoryService.dto.OrderDto;
import com.retail.InventoryService.form.CreateOrderForm;
import com.retail.InventoryService.form.OrderedItemForm;
import com.retail.InventoryService.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ItemQuantityService itemQuantityService;

    @Override
    public Optional<OrderDto> createOrder(CreateOrderForm orderForm) {
        List<ItemQuantity> avaiableItems = new ArrayList<>();
        Collection<ItemLine> itemLines = new ArrayList<>();
        for (OrderedItemForm orderedItem : orderForm.getOrderedItems()) {
            Optional<ItemQuantity> optionalItemQuantity = itemQuantityService.findItemQuantityByID(orderedItem.getItemID());
            if (!optionalItemQuantity.isPresent()) {
                throw new IllegalArgumentException("Item does not exists");
            }
            ItemQuantity availableItem = optionalItemQuantity.get();
            if (availableItem.getQuantity() < orderedItem.getQuantity()) {
                throw new IllegalArgumentException("Item does not have enough in stock");
            }
            itemLines.add(new ItemLine(orderedItem.getQuantity(), orderedItem.getItemID()));
            availableItem.setQuantity(availableItem.getQuantity() - orderedItem.getQuantity());
            avaiableItems.add(availableItem);
        }
        Order order = new Order(itemLines, 1);
        Order newOrder = orderRepository.save(order);
        return Optional.ofNullable(modelMapper.map(newOrder, OrderDto.class));
    }
}
