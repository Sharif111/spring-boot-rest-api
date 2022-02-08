package com.user.app.controller;

import com.user.app.model.DonarDto;
import com.user.app.service.DonarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donars")
public class DonarController {

    @Autowired
    private DonarService donarService;


    @PostMapping
    public ResponseEntity<DonarDto> createDonar(@RequestBody DonarDto donarDto){
        return new ResponseEntity<>(donarService.createDonar(donarDto), HttpStatus.CREATED);
    }

    // get all donars rest api
    @GetMapping
    public List<DonarDto> getAllDonars(){
        return donarService.getAllDonars();
    }

    // get donar by id
    @GetMapping("/{id}")
    public ResponseEntity<DonarDto> getDonarById(@PathVariable(name = "id") long id){
        return ResponseEntity.ok(donarService.getDonarById(id));
    }

    // update donar by id rest api
    @PutMapping("/{id}")
    public ResponseEntity<DonarDto> updateDonar(@RequestBody DonarDto donarDto, @PathVariable(name = "id") long id){
        DonarDto donarResponse = donarService.updateDonar(donarDto, id);
        return new ResponseEntity<>(donarResponse, HttpStatus.OK);
    }

    // delete donar by id rest api
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDonarById(@PathVariable(name = "id") long id){
        donarService.deleteDonarById(id);
        return new ResponseEntity<>("Donar entity deleted successfully.", HttpStatus.OK);
    }





}
