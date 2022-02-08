package com.donation.app.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "distributionInfo")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistributionInfoEntity extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dist_id;
    private String amount;
    private String donatedAccountNo;
    private String donatedAccountTitle;
    private String donatedDate;
    private String donatedTransactionId;
    private String donatedStatus;


    @ManyToOne
    @JoinColumn(name="donationTableId", nullable=false)
    private DonationEntity donationEntity;

    @ManyToOne
    @JoinColumn(name="distributionMasterId", nullable=false)
    private DonationEntity donationEntities;


}
