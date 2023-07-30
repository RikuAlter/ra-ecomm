package com.raecomm.ecomm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private Integer sku;
    @NonNull
    private String name;
    private String description;
    private String imageUrl;
    @NonNull
    private LocalDateTime createdAt;
    @NonNull
    private LocalDateTime lastModified;
    @NonNull
    private Double defaultPrice;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Price> prices;
    @ManyToMany
    @JoinTable(
            name = "product_category_mapping",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "productCategory_id")
    )
    private Set<ProductCategory> categories;
    @ManyToMany(mappedBy = "products", cascade = CascadeType.MERGE)
    private Set<DistributionCenter> distributionCenters;

}
