package com.mjc.stage2.impl;


import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class ManufactureFilteringStrategy implements FilteringStrategy {
    private String manufacture;


    @Override
    public boolean filter(Product product) {
        return manufacture == null || manufacture.equalsIgnoreCase(product.getManufacture());
    }
}
