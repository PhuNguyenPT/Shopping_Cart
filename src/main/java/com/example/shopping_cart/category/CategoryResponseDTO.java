package com.example.shopping_cart.category;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CategoryResponseDTO {
    private final Long id;
    private final String name;
}