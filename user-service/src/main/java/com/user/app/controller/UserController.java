package com.user.app.controller;

import com.user.app.dto.AddressInfoDto;
import com.user.app.dto.LocationTreeDto;
import com.user.app.model.UserRegistraionResponse;
import com.user.app.responseModel.CommonResposeModel;
import com.user.app.service.AddressService;
import com.user.app.service.LocationTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-api")
public class UserController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private LocationTreeService locationTreeService;


    @GetMapping("/user-registraion")
    public UserRegistraionResponse doRegistration() {
        return new UserRegistraionResponse("0", "success");
    }


    @GetMapping("/addresses")
    public List<AddressInfoDto> getAddresses() {
        return addressService.getAddresses();
    }




//    @PostMapping("/addAddress")
//    public AddressInfoEntity addAddress(@RequestBody AddressInfoEntity addressInfoEntity) {
//        System.out.println("addressInfoEntity = " + addressInfoEntity);
//        return addressService.save(addressInfoEntity);
//    }

    @PostMapping("/add-location")
    public CommonResposeModel addLocation(@RequestBody LocationTreeDto locationTreeDto) {
        return locationTreeService.save(locationTreeDto);
    }

//    @GetMapping("/locationTrees")
//    List<LocationTreeEntity> savelocationTrees() {
//        return locationTreeService.getLocationTrees();
//    }

//    @GetMapping("/location-trees")
//   public List<LocationTreeEntity> getlocationTrees() {
//        return locationTreeService.getLocationTrees();
//    }
    /*
    @GetMapping("/locations2/{locationId}")
    List<LocationTreeEntity> getLocations(@PathVariable long locationId) {
        return locationRepo.findAllById(Collections.singleton(locationId));
    }
    */



}
