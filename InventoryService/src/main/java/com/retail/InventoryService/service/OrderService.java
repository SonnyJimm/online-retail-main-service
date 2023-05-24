package com.retail.InventoryService.service;

import com.retail.InventoryService.dto.OrderDto;
import com.retail.InventoryService.form.CreateOrderForm;

import java.util.Optional;

public interface OrderService {
    Optional<OrderDto> createOrder(CreateOrderForm orderForm);
}
