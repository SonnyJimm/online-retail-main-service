package com.retail.InventoryService.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigs {
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }

}