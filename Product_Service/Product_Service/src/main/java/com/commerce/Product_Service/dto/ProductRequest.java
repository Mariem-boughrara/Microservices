package com.commerce.Product_Service.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class ProductRequest {
    private BigDecimal price;
    private String name;
    private String description ;
}
