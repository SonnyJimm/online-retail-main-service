package com.retail.InventoryService.repository;

import com.retail.InventoryService.domain.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {
}
