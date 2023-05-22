package com.retail.ItemService.dto;

import com.retail.ItemService.domain.Review;
import lombok.Data;

import java.util.List;


@Data
public class ItemDto {
    private int id;
    private String name;
    private String description;
    private double price;
    private String image;
    private int barcode;
    private List<Review> reviews;
}
