package com.user.app.repository;

import com.user.app.entity.AddressesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<AddressesEntity,Long> {

    //AddressInfoEntity findByLocationID(Long locationId);
  //  AddressInfoEntity findByIdAndLocationId(Long id, Long locationId);
}
