package com.donation.app.repository;

import com.donation.app.entity.DistributionMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistributionMasterRepo extends JpaRepository<DistributionMasterEntity,Long> {
}
