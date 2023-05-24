package com.retail.ItemService.controller;

import com.retail.ItemService.domain.Order;
import com.retail.ItemService.dto.OrderResponse;
import com.retail.ItemService.form.OrderForm;
import com.retail.ItemService.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/customers/{customerID}/order")
    public OrderResponse createOrder(@RequestBody @Valid OrderForm form, @PathVariable int customerID) {
        return orderService.createOrder(form, customerID);
    }
}
