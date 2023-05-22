package com.retail.InventoryService.domain;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private States state;
    @OneToMany
    @JoinColumn(name = "orderID")
    private List<ItemLine> itemLines;
    @OneToOne
    @JoinColumn
    private ShippingAddress shippingAddress;
    private int customerID;
}
