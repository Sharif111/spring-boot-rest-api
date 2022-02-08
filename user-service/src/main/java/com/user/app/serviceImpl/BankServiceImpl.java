package com.user.app.serviceImpl;

import com.user.app.entity.BankEntity;
import com.user.app.entity.DonarEntity;
import com.user.app.exception.DonarAPIException;
import com.user.app.exception.ResourceNotFoundException;
import com.user.app.model.BankDto;
import com.user.app.repository.BankRepo;
import com.user.app.repository.DonarRepo;
import com.user.app.service.BankService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankServiceImpl implements BankService {



    public BankServiceImpl(BankRepo bankRepo, DonarRepo donarRepo, ModelMapper mapper)
    {
        this.bankRepo = bankRepo;
        this.donarRepo=donarRepo;
        this.mapper=mapper;
    }

    private BankRepo bankRepo;
    private DonarRepo donarRepo;
    private ModelMapper mapper;


    @Override
    public BankDto createBank(long donarId, BankDto bankDto) {
        BankEntity bankEntity=mapToEntity(bankDto);

        // retrieve donar entity by id
        DonarEntity donarEntity = donarRepo.findById(donarId).orElseThrow(
                () -> new ResourceNotFoundException("DonarEntity", "id", donarId));

        // set donar to bank entity
        bankEntity.setDonarEntity(donarEntity);

        // bank entity to DB
        BankEntity newBankEntity =  bankRepo.save(bankEntity);

        return mapToDTO(newBankEntity);

    }

    @Override
    public List<BankDto> getBanksByDonarId(long donarId) {
        // retrieve banks by donarId
        List<BankEntity> bankEntities = bankRepo.findByBankId(donarId);

        // convert list of bank entities to list of bank dto's
        return bankEntities.stream().map(bankEntity -> mapToDTO(bankEntity)).collect(Collectors.toList());
    }


    @Override
    public BankDto getBankById(Long donarId, long bankid) {
        // retrieve donar entity by id
        DonarEntity donarEntity = donarRepo.findById(donarId).orElseThrow(
                () -> new ResourceNotFoundException("DonarEntity", "id", donarId));

        // retrieve bank by id
        BankEntity bankEntity = bankRepo.findById(bankid).orElseThrow(() ->
                new ResourceNotFoundException("BankEntity", "id", donarId));

//        if(!bankEntity.getDonarEntity().getId().equals(donarEntity.getId())){
//            throw new DonarAPIException(HttpStatus.BAD_REQUEST, "Bank does not belong to donar");
//        }

        return mapToDTO(bankEntity);
    }


    @Override
    public BankDto updateBank(Long donarId, long bankId, BankDto bankRequest) {
        // retrieve donar entity by id
        DonarEntity donarEntity = donarRepo.findById(donarId).orElseThrow(
                () -> new ResourceNotFoundException("DonarEntity", "id", donarId));

        // retrieve bank by id
        BankEntity bankEntity = bankRepo.findById(bankId).orElseThrow(() ->
                new ResourceNotFoundException("BankEntity", "id", bankId));

//        if(!bankEntity.getDonarEntity().getId().equals(donarEntity.getId())){
//            throw new DonarAPIException(HttpStatus.BAD_REQUEST, "Bank does not belongs to donar");
//        }

        bankEntity.setBankName(bankRequest.getBankName());
        bankEntity.setBranchName(bankRequest.getBranchName());
        bankEntity.setBranchCode(bankRequest.getBranchCode());
        bankEntity.setAccountNo(bankRequest.getAccountNo());
        bankEntity.setAccountTitle(bankRequest.getAccountTitle());
        bankEntity.setAccountType(bankRequest.getAccountType());


        BankEntity updatedBank = bankRepo.save(bankEntity);
        return mapToDTO(updatedBank);
    }



    @Override
    public void deleteBank(Long donarId, Long bankId) {
        // retrieve donar entity by id
        DonarEntity donarEntity = donarRepo.findById(donarId).orElseThrow(
                () -> new ResourceNotFoundException("DonarEntity", "id", donarId));

        // retrieve bank by id
        BankEntity bankEntity = bankRepo.findById(bankId).orElseThrow(() ->
                new ResourceNotFoundException("BankEntity", "id", bankId));

//        if(!bankEntity.getDonarEntity().getId().equals(donarEntity.getId())){
//            throw new DonarAPIException(HttpStatus.BAD_REQUEST, "Bank does not belongs to donar");
//        }

        bankRepo.delete(bankEntity);
    }


    // convert Entity into DTO
    private BankDto mapToDTO(BankEntity bankEntity){
        BankDto bankDto = mapper.map(bankEntity, BankDto.class);
        return bankDto;
    }



    // convert DTO to entity
    private BankEntity mapToEntity(BankDto bankDto){
        BankEntity bankEntity = mapper.map(bankDto, BankEntity.class);
        return bankEntity;
    }




}
