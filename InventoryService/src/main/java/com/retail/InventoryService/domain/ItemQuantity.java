package com.retail.InventoryService.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ItemQuantity {
    @Id
    private int itemID;
    private int quantity;

    public ItemQuantity() {
    }

    public ItemQuantity(int itemID, int quantity) {
        this.itemID = itemID;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

