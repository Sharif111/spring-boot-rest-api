package com.user.app.repository;

import com.user.app.entity.SystemFavoriteMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemFavoriteMenuRepo extends JpaRepository<SystemFavoriteMenuEntity, Long> {
}
