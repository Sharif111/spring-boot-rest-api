package com.user.app.controller;

import com.user.app.dto.LocationTreeDto;
import com.user.app.repository.AddressRepo;

import com.user.app.repository.LocationRepo;
import com.user.app.responseModel.CommonResposeModel;
import com.user.app.service.LocationTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/locationTrees")
public class LocationTreeController {


    @Autowired
    private LocationTreeService  locationTreeService;


    @PostMapping("/add-locaiton")
    public CommonResposeModel addLocation(@RequestBody LocationTreeDto dto) {
        return locationTreeService.save(dto);
    }

    @GetMapping("/locations")
    public List<LocationTreeDto> getLocations() {
        return locationTreeService.getLocations();
    }

    @GetMapping("/location/{id}")
    public LocationTreeDto getLocation(@PathVariable long id) {
        return locationTreeService.getById(id);
    }



    @PutMapping("/location-update/{id}")
    public CommonResposeModel update(@PathVariable long id,  @RequestBody LocationTreeDto locationTreeDto) {
        return locationTreeService.update(id,locationTreeDto);
    }

    @DeleteMapping("location-delete/{id}")
    public CommonResposeModel delete(@PathVariable long id) {
        return locationTreeService.delete(id);
    }



}
