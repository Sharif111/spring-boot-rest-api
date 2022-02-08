package com.user.app.dto;

import com.user.app.entity.LocationTreeEntity;


public class AddressInfoDto {

    private long addressInfoId;
    private String addressTypeCode;
    private String addressDetails;
    private long locationId;
    private LocationTreeDto locationTree;

    public long getAddressInfoId() {
        return addressInfoId;
    }

    public void setAddressInfoId(long addressInfoId) {
        this.addressInfoId = addressInfoId;
    }

    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    public void setAddressTypeCode(String addressTypeCode) {
        this.addressTypeCode = addressTypeCode;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public LocationTreeDto getLocationTree() {
        return locationTree;
    }

    public void setLocationTree(LocationTreeDto locationTree) {
        this.locationTree = locationTree;
    }
}
