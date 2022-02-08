package com.user.app.repository;

import com.user.app.entity.OrganizationInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepo extends JpaRepository<OrganizationInfoEntity,Long> {
}
