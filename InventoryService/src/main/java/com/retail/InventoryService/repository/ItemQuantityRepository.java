package com.retail.InventoryService.repository;

import com.retail.InventoryService.domain.ItemQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemQuantityRepository extends JpaRepository<ItemQuantity, Integer> {

}
