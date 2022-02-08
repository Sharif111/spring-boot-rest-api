package com.donation.app.responseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DonationResponse {
    private String responseCode = "";
    private String responseMessage = "";
}
