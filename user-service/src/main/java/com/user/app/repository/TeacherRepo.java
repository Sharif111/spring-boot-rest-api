package com.user.app.repository;

import com.user.app.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<TeacherEntity,Long> {
}
