package com.retail.InventoryService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class ShippingAddress {
    @Id
    @GeneratedValue
    private int id;
    private String addressLine1;
    private String addressLine2;
    private int zip;
    private String city;
    private String State;
    private int customerID;
}
