package com.raecomm.ecomm.repository;

import com.raecomm.ecomm.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PriceRepository extends JpaRepository<Price, Integer> {
}
