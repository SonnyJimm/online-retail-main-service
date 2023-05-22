package com.retail.ItemService.controller;

import com.retail.ItemService.dto.ItemDto;
import com.retail.ItemService.form.CreateItemForm;
import com.retail.ItemService.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
 * @TODO
 * Error handling
 * */
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    /*
     * @TODO
     * Pageable
     * */
    public List<ItemDto> getAllItems() {
        return itemService.getAllItems();
    }

    /*
     * @TODO
     * Validation
     * Error handling
     * */
    @PostMapping
    public ResponseEntity<?> createItem(@RequestBody CreateItemForm form) {
        Optional<ItemDto> item = itemService.createItem(form);
        return item.map(ResponseEntity::ok).orElse(ResponseEntity.unprocessableEntity().build());
    }

    /*
     * @TODO
     * Not sure but maybe visit here
     * */
    @GetMapping("/{itemId}")
    public ResponseEntity<?> getItem(@PathVariable int itemId) {
        Optional<ItemDto> optionalItemDto = itemService.getItemByID(itemId);
        return optionalItemDto.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
