package com.srs.e_commerce.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CartItemDTO {
    private Long id;
    private Long productId;
    @Positive
    private Integer quantity;
}