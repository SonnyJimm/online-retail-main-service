package com.retail.ItemService.service;

import com.retail.ItemService.dto.ItemDto;
import com.retail.ItemService.form.CreateItemForm;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<ItemDto> getAllItems();

    Optional<ItemDto> createItem(CreateItemForm form);

    Optional<ItemDto> getItemByID(int itemID);
}
