package com.retail.InventoryService;

import com.retail.InventoryService.domain.ItemQuantity;
import com.retail.InventoryService.repository.ItemQuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication implements CommandLineRunner {

    @Autowired
    ItemQuantityRepository itemQuantityRepository;

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        itemQuantityRepository.save(new ItemQuantity(1, 7));
        itemQuantityRepository.save(new ItemQuantity(2, 7));
        itemQuantityRepository.save(new ItemQuantity(3, 7));
    }
}
