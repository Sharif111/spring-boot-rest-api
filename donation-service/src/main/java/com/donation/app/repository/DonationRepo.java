package com.donation.app.repository;

import com.donation.app.entity.DonationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepo extends JpaRepository<DonationEntity,Long> {



}
