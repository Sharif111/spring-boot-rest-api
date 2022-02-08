package com.user.app.repository;

import com.user.app.entity.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepo extends JpaRepository<DocumentEntity,Long> {
}
