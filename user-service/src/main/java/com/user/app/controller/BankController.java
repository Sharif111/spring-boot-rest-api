package com.user.app.controller;

import com.user.app.entity.BankEntity;
import com.user.app.model.BankDto;
import com.user.app.repository.BankRepo;
import com.user.app.service.BankService;
import com.user.app.serviceImpl.BankServiceImpl;
import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class BankController {
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @Autowired
    private BankService bankService;

    // create bank rest api
    @PostMapping("/donars/{donarId}/banks")
    public ResponseEntity<BankDto>createBank(@PathVariable(value = "donarId") long donarId,
                                              @RequestBody BankDto bankDto){
        return new ResponseEntity<>(bankService.createBank(donarId,bankDto), HttpStatus.CREATED);
    }


    @GetMapping("/donars/{donarId}/banks")
    public List<BankDto> getBankByDonarId(@PathVariable(value = "donarId") Long donarId){
        return bankService.getBanksByDonarId(donarId);
    }


    @GetMapping("/donars/{donarId}/banks/{id}")
    public ResponseEntity<BankDto> getBankById(@PathVariable(value = "donarId") Long donarId,
                                                     @PathVariable(value = "id") Long bankId){
        BankDto bankDto = bankService.getBankById(donarId, bankId);
        return new ResponseEntity<>(bankDto, HttpStatus.OK);
   }

    @PutMapping("/donars/{donarId}/banks/{id}")
    public ResponseEntity<BankDto> updateBank(@PathVariable(value = "donarId") Long donarId,
                                                    @PathVariable(value = "id") Long bankId,
                                                    @RequestBody BankDto bankDto){
        BankDto updatedBank = bankService.updateBank(donarId, bankId, bankDto);
        return new ResponseEntity<>(updatedBank, HttpStatus.OK);
    }

    @DeleteMapping("/donars/{donarId}/banks/{id}")
    public ResponseEntity<String> deleteBank(@PathVariable(value = "donarId") Long donarId,
                                                @PathVariable(value = "id") Long bankId){
        bankService.deleteBank(donarId, bankId);
        return new ResponseEntity<>("Bank deleted successfully", HttpStatus.OK);
    }



}
