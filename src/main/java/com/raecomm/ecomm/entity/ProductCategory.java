package com.raecomm.ecomm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String categoryId;
    private String description;
    @ManyToMany(mappedBy = "childCategories")
    private Set<ProductCategory> parentCategories;
    @ManyToMany
    private Set<ProductCategory> childCategories;
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products;
}
