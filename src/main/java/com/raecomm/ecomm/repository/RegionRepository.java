package com.raecomm.ecomm.repository;

import com.raecomm.ecomm.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
