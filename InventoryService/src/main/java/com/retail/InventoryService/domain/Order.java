package com.retail.InventoryService.domain;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private States state;
    @OneToMany
    @JoinColumn(name = "orderID")
    private List<ItemLine> itemLines;
    private int customerID;
}
