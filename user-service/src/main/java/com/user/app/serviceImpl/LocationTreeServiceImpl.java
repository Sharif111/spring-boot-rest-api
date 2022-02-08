package com.user.app.serviceImpl;

import com.user.app.dto.LocationTreeDto;
import com.user.app.entity.LocationTreeEntity;
import com.user.app.repository.LocationRepo;
import com.user.app.responseModel.CommonResposeModel;
import com.user.app.service.LocationTreeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LocationTreeServiceImpl implements LocationTreeService {


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LocationRepo locationRepo;

    @Override
    public CommonResposeModel save(LocationTreeDto locationTreeDto) {
        CommonResposeModel commonResposeModel = new CommonResposeModel();
        LocationTreeEntity locationTreeEntity = locationRepo.save(modelMapper.map(locationTreeDto, LocationTreeEntity.class));

        if (locationTreeEntity.getLocationId() > 0) {
            commonResposeModel.setResposeCode(1);
            commonResposeModel.setResposeMessage("Location  Save Successfully");
            commonResposeModel.setId(locationTreeEntity.getLocationId());
        }

        return commonResposeModel;
    }

    @Override
    public List<LocationTreeDto> getLocations() {
        List<LocationTreeEntity> list = locationRepo.findAll();
        return list.stream().map(model ->
                entityToDto(model)).collect(Collectors.toList());
    }

    @Override
    public CommonResposeModel update(long id,LocationTreeDto locationTreeDto) {
        CommonResposeModel commonResposeModel = new CommonResposeModel();
        Optional<LocationTreeEntity> optionalLocationTree = locationRepo.findById(id);
        if (!optionalLocationTree.isPresent()) {
            commonResposeModel.setResposeMessage("No Data Found "+id);
            return commonResposeModel;
        }
        LocationTreeEntity locationTree = dtoToEntity(locationTreeDto);
        locationTree.setLocationId(optionalLocationTree.get().getLocationId());
        LocationTreeEntity update = locationRepo.save(locationTree);

        commonResposeModel.setResposeCode(1);
        commonResposeModel.setResposeMessage("Location  update Successfully");
        return commonResposeModel;
    }

    @Override
    public CommonResposeModel delete(long id) {
        CommonResposeModel commonResposeModel = new CommonResposeModel();
        Optional<LocationTreeEntity> optionalLocationTree = locationRepo.findById(id);
        if (!optionalLocationTree.isPresent()) {
            commonResposeModel.setResposeMessage("No Data Found "+id);
            return commonResposeModel;
        }
        locationRepo.delete(optionalLocationTree.get());
        commonResposeModel.setResposeCode(1);
        commonResposeModel.setResposeMessage("Location  delete Successfully ");
        return commonResposeModel;
    }

    @Override
    public LocationTreeDto getById(long id) {
        Optional<LocationTreeEntity> optionalLocationTree = locationRepo.findById(id);
        if (!optionalLocationTree.isPresent()) {
            return new LocationTreeDto();
        }
        LocationTreeEntity locationTree = optionalLocationTree.get();

        return entityToDto(locationTree);
    }


    public LocationTreeDto entityToDto(LocationTreeEntity entity) {
        LocationTreeDto dto = modelMapper.map(entity, LocationTreeDto.class);
        return dto;
    }

    public LocationTreeEntity dtoToEntity(LocationTreeDto dto) {
        LocationTreeEntity entity = modelMapper.map(dto, LocationTreeEntity.class);
        return entity;
    }
}
