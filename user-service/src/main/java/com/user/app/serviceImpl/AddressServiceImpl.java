package com.user.app.serviceImpl;

import com.user.app.dto.AddressInfoDto;
import com.user.app.entity.AddressesEntity;
import com.user.app.repository.AddressRepo;
import com.user.app.responseModel.CommonResposeModel;
import com.user.app.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AddressInfoDto> getAddresses() {
        List<AddressesEntity> list = addressRepo.findAll();
        return list.stream().map(model ->
                entityToDto(model)).collect(Collectors.toList());
    }

    @Override
    public List<AddressesEntity> getAddresses2() {
    return addressRepo.findAll();
    }


    @Override
    public CommonResposeModel save(AddressInfoDto dto) {
        CommonResposeModel commonResposeModel = new CommonResposeModel();
        AddressesEntity entity = dtoToEntity(dto);
        if (entity.getAddreesInfoId()>0){
            commonResposeModel.setResposeCode(1);
            commonResposeModel.setResposeMessage("Location  Save Successfully");
            commonResposeModel.setId(entity.getAddreesInfoId());
        }
        return commonResposeModel;
    }

    @Override
    public CommonResposeModel update(long id, AddressInfoDto dto) {
        return null;
    }

    @Override
    public CommonResposeModel delete(long id) {
        return null;
    }

    @Override
    public AddressInfoDto getById(long id) {
        return null;
    }


    public AddressInfoDto entityToDto(AddressesEntity entity) {
        AddressInfoDto dto = modelMapper.map(entity, AddressInfoDto.class);
        return dto;
    }

    public AddressesEntity dtoToEntity(AddressInfoDto dto) {
        AddressesEntity entity = modelMapper.map(dto, AddressesEntity.class);
        return entity;
    }
}
