package com.raecomm.ecomm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Map;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistributionCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private Set<String> pinCodes;
    @NonNull
    private String name;
    @ManyToMany
    @JoinTable(
            name = "dc_product",
            joinColumns = @JoinColumn(name = "dc_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> products;
    @ElementCollection
    @CollectionTable(
            name = "dc_stock",
            joinColumns = @JoinColumn(name = "dc_id")
    )
    @MapKeyJoinColumn(name = "product_id")
    @Column(name = "stock")
    private Map<Product, Integer> stocks;
}
