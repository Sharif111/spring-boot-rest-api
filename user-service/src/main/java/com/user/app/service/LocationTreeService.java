package com.user.app.service;

import com.user.app.dto.LocationTreeDto;
import com.user.app.responseModel.CommonResposeModel;

import java.util.List;

public interface LocationTreeService {
    CommonResposeModel save(LocationTreeDto locationTreeDto );
    List<LocationTreeDto> getLocations();
    CommonResposeModel update(long id,LocationTreeDto locationTreeDto );
    CommonResposeModel delete(long id);
    LocationTreeDto getById(long id);

}
