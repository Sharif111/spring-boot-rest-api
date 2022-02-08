package com.user.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "AddressInfo")
public class AddressesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addreesInfoId;

    private String addressTypeCode;
    private String addressDetails;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "locationId",nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocationTreeEntity locationTree;


    public long getAddreesInfoId() {
        return addreesInfoId;
    }

    public void setAddreesInfoId(long addreesInfoId) {
        this.addreesInfoId = addreesInfoId;
    }

    public LocationTreeEntity getLocationTree() {
        return locationTree;
    }

    public void setLocationTree(LocationTreeEntity locationTree) {
        this.locationTree = locationTree;
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
}
