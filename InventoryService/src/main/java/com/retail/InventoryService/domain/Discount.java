package com.retail.InventoryService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Discount {
    @Id
    @GeneratedValue
    private int id;
    private String discountCode;
    private int discountAmount;
}
