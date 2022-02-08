package com.donation.app.repository;

import com.donation.app.entity.DistributionInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistributionInfoRepo extends JpaRepository<DistributionInfoEntity,Long> {
}
