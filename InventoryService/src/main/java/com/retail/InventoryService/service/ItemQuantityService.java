package com.retail.InventoryService.service;

import com.retail.InventoryService.domain.ItemQuantity;
import com.retail.InventoryService.dto.ItemQuantityDto;

import java.util.Optional;

public interface ItemQuantityService {
    Optional<ItemQuantity> findItemQuantityByID(int itemID);
}
