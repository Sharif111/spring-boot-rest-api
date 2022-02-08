package com.user.app.repository;

import com.user.app.entity.SystemUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserRepo extends JpaRepository<SystemUserEntity, Long> {
}
