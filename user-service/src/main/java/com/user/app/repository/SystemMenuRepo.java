package com.user.app.repository;

import com.user.app.entity.SystemMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemMenuRepo extends JpaRepository<SystemMenuEntity, Long> {
}
