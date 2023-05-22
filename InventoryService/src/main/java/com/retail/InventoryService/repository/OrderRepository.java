package com.retail.InventoryService.repository;

import com.retail.InventoryService.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
