package com.user.app.repository;

import com.user.app.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepo extends JpaRepository<BankEntity,Long> {
   List<BankEntity> findByBankId(long donarId);
}
