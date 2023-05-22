package com.retail.InventoryService.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ItemQuantity {
    @Id
    @GeneratedValue
    private int id;
    private int itemID;
    private int quantity;
}
