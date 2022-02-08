package com.user.app.service;

import com.user.app.model.BankDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BankService {
    BankDto createBank(long donarId, BankDto bankDto);

    List<BankDto>getBanksByDonarId(long donarId);

    BankDto getBankById(Long donarId, long bankid);

    BankDto updateBank(Long donarId, long bankId, BankDto bankRequest);

    void deleteBank(Long donarId, Long bankId);
}
