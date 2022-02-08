package com.user.app.service;

import com.user.app.dto.AddressInfoDto;
import com.user.app.entity.AddressesEntity;
import com.user.app.responseModel.CommonResposeModel;

import java.util.List;

public interface AddressService {

    List<AddressInfoDto> getAddresses();
    CommonResposeModel save(AddressInfoDto dto);
    CommonResposeModel update(long id,AddressInfoDto dto);
    CommonResposeModel delete(long id);
    AddressInfoDto getById(long id);
    List<AddressesEntity> getAddresses2();

}
