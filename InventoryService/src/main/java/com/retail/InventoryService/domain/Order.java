package com.retail.InventoryService.domain;


import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private States state;
    @OneToMany
    @JoinColumn(name = "orderID")
    private Collection<ItemLine> itemLines;
    private int customerID;

    public Order(Collection<ItemLine> itemLines, int customerID) {
        this.state = States.NEW;
        this.itemLines = itemLines;
        this.customerID = customerID;
    }
}
