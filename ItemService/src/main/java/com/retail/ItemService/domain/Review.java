package com.retail.ItemService.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    @Column(length = 1000, nullable = false)
    private String description;
    private int stars;
    private int customerID;
    @CreationTimestamp
    private Date createdDate;

    public Review() {
    }

    public Review(String title, String description, int stars, int customerID) {
        this.title = title;
        this.description = description;
        this.stars = stars;
        this.customerID = customerID;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
