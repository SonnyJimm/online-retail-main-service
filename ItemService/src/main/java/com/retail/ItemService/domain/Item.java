package com.retail.ItemService.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Column(length = 1000)
    private String description;
    private double price;
    private String image;
    private int barcode;
    private int quantity;
    @OneToMany
    @JoinColumn(name = "itemID")
    @OrderColumn(name = "sequence")
    private List<Review> reviews;

    public Item() {
    }

    public Item(String name, String description, double price, String image, int barcode, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.barcode = barcode;
        this.quantity = quantity;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
}
