package com.retail.InventoryService.service;

import com.retail.InventoryService.domain.ItemQuantity;
import com.retail.InventoryService.dto.ItemQuantityDto;
import com.retail.InventoryService.repository.ItemQuantityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public class ItemQuantityServiceImpl implements ItemQuantityService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ItemQuantityRepository itemQuantityRepository;

    @Override
    public Optional<ItemQuantity> findItemQuantityByID(int itemID) {
        return itemQuantityRepository.findById(itemID);
    }
}
