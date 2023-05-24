package com.retail.InventoryService.service;

import com.retail.InventoryService.dto.DiscountDto;
import com.retail.InventoryService.form.CreateDiscountForm;

import java.util.Optional;

public interface DiscountService {
    Optional<DiscountDto> createDiscount(CreateDiscountForm form);
}
