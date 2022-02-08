package com.user.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.user.app.entity.AddressesEntity;

import java.util.Set;
public class LocationTreeDto {

    private long locationId;
    private String treeType;
    private int treeCode;
    private String treeName;
    private int sortOrder;
    private int treeLevel;

    private Set<AddressInfoDto> locations;

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public int getTreeCode() {
        return treeCode;
    }

    public void setTreeCode(int treeCode) {
        this.treeCode = treeCode;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getTreeLevel() {
        return treeLevel;
    }

    public void setTreeLevel(int treeLevel) {
        this.treeLevel = treeLevel;
    }

    public Set<AddressInfoDto> getLocations() {
        return locations;
    }

    public void setLocations(Set<AddressInfoDto> locations) {
        this.locations = locations;
    }
}
