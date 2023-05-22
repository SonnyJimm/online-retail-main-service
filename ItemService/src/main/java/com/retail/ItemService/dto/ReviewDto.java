package com.retail.ItemService.dto;

import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Data
public class ReviewDto {
    private int id;
    private String title;
    private String description;
    private int stars;
    private int customerID;
    private Date createdDate;
}
