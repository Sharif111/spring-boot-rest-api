package com.donation.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "donation")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DonationEntity extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long donationId;
    private String accountNo;
    private String donationAmount;
    private String donationType;
    private String donationToReference;
    private String donarTransactionId;
    private String payMode;
    private String transactionMode;
    private String transactionComplete;
    private String remarks;
    private String donationDate;
    private String donationReceiveFlag;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "donationEntity")
    private Set<DistributionInfoEntity> distributionInfoEntities;


}
