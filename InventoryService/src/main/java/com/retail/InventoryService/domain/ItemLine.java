package com.retail.InventoryService.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ItemLine {
    @Id
    @GeneratedValue
    private int id;
    private int quantity;
    private int itemID;
    @ManyToOne
    private Discount discount;

    public ItemLine() {
    }

    public ItemLine(int quantity, int itemID) {
        this.quantity = quantity;
        this.itemID = itemID;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
