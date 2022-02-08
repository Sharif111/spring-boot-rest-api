package com.user.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "location_tree")
public class LocationTreeEntity {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private long locationId;

    @Id
    @SequenceGenerator(
            name = "locationId",
            sequenceName = "sq_locationId",
            allocationSize = 1,
            initialValue = 200
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "locationId"
    )
    private long locationId;


    private String treeType;
    private int treeCode;
    private String treeName;
    private int sortOrder;
    private int treeLevel;

    @OneToMany(mappedBy = "locationTree", cascade = CascadeType.ALL)
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<AddressesEntity> locations = new HashSet<>();

    public Set<AddressesEntity> getLocations() {
        return locations;
    }

    public void setLocations(Set<AddressesEntity> locations) {
        this.locations = locations;
        for(AddressesEntity a : locations) {
            a.setLocationTree(this);
        }
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

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }
}
