package com.retail.InventoryService.service;

import com.retail.InventoryService.dto.DiscountDto;
import com.retail.InventoryService.form.CreateDiscountForm;
import com.retail.InventoryService.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public Optional<DiscountDto> createDiscount(CreateDiscountForm form) {

        return Optional.empty();
    }
}
