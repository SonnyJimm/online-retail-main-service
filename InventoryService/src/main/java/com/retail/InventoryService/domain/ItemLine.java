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
    @JoinTable
    private Discount discount;

}
