package com.retail.InventoryService.service;

import com.retail.InventoryService.dto.ShippingAddressDto;
import com.retail.InventoryService.form.PrimaryShippingAddress;
import com.retail.InventoryService.repository.ShippingAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ShippingAddressServiceImp implements ShippingAddressService{
    @Autowired
    private ShippingAddressRepository shippingAddressRepository;

    @Override
    public Optional<ShippingAddressDto> setPrimaryShippingAddress(PrimaryShippingAddress shippingAddress) {
        return Optional.empty();
    }
}
