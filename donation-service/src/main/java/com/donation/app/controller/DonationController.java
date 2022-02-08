package com.donation.app.controller;

import com.donation.app.responseModel.DonationResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/donation/v1/")
public class DonationController {
    @GetMapping("donation")
    public DonationResponse getDonatinResponse(){
        return new DonationResponse("0","Success");
    }
}
