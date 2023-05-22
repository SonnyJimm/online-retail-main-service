package com.retail.ItemService.service;

import com.retail.ItemService.domain.Item;
import com.retail.ItemService.dto.ItemDto;
import com.retail.ItemService.form.CreateItemForm;
import com.retail.ItemService.repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ModelMapper mapper;
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<ItemDto> getAllItems() {
        return itemRepository.findAll().stream().map(item -> mapper.map(item, ItemDto.class)).toList();
    }

    @Override
    public Optional<ItemDto> createItem(CreateItemForm form) {
        Optional<ItemDto> optionalItem;
        try {
            Item item = new Item(form.getName(), form.getDescription(), form.getPrice(), form.getImage(), form.getBarcode(), form.getQuantity());
            optionalItem = Optional.of(mapper.map(itemRepository.save(item), ItemDto.class));
        } catch (Exception e) {
            optionalItem = Optional.of(null);
        }
        return optionalItem;
    }

    @Override
    public Optional<ItemDto> getItemByID(int itemID) {
        Optional<Item> optionalItem = itemRepository.findById(itemID);
        return Optional.ofNullable(optionalItem.map(item -> mapper.map(item, ItemDto.class)).orElse(null));
    }

}

