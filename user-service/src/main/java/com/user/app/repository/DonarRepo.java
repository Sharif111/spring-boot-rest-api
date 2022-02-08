package com.user.app.repository;

import com.user.app.entity.DonarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonarRepo extends JpaRepository<DonarEntity,Long> {
}
