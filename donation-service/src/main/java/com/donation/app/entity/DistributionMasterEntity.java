package com.donation.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "distributionMaster")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistributionMasterEntity extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long distributeMasterId;
    private String totalAmount;
    private String distTotalStudent;
    private long totalInstitute;
    private String totalDonateAmount;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "donationEntities")
    private Set<DistributionInfoEntity> distributionInfoEntitySet;

}
