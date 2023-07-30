package com.raecomm.ecomm.repository;

import com.raecomm.ecomm.entity.DistributionCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DistributionCenterRepository extends JpaRepository<DistributionCenter, Integer> {
}
