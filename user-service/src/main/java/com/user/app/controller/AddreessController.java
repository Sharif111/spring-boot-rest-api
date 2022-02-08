package com.user.app.controller;



import com.user.app.dto.AddressInfoDto;
import com.user.app.dto.LocationTreeDto;
import com.user.app.entity.AddressesEntity;

import com.user.app.entity.LocationTreeEntity;
import com.user.app.repository.AddressRepo;

import com.user.app.repository.LocationRepo;

import com.user.app.responseModel.CommonResposeModel;
import com.user.app.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.awt.print.Book;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/addresses")
public class AddreessController {
    @Autowired
   private AddressService addressService;


    @PostMapping("/add-address")
    public CommonResposeModel addAddress(@RequestBody AddressInfoDto dto) {
        return addressService.save(dto);
    }

    @GetMapping("/addresses")
    public List<AddressInfoDto> getAddresses() {
        return addressService.getAddresses();
    }

    @GetMapping("/addresses2")
    public List<AddressesEntity> getAddresses2() {
        return addressService.getAddresses2();
    }
}
