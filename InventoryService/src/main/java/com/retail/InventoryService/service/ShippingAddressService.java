package com.retail.InventoryService.service;

import com.retail.InventoryService.dto.ShippingAddressDto;
import com.retail.InventoryService.form.PrimaryShippingAddress;

import java.util.Optional;

public interface ShippingAddressService {
    public Optional<ShippingAddressDto> setPrimaryShippingAddress(PrimaryShippingAddress shippingAddress);
}
