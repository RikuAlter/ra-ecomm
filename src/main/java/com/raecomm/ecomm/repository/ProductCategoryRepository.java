package com.raecomm.ecomm.repository;

import com.raecomm.ecomm.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
