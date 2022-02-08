package com.user.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

import javax.persistence.Column;

@Entity
@Table(name = "bank_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BankEntity  extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bankId;

    @Column(name = "bankName", nullable = false)
    private String bankName;

    @Column(name = "branchName", nullable = false)
    private String branchName;

    @Column(name = "branchCode", nullable = false)
    private String branchCode;

    @Column(name = "accountNo", nullable = false)
    private String accountNo;

    @Column(name = "accountTitle", nullable = false)
    private String accountTitle;

    @Column(name = "accountType", nullable = false)
    private String accountType;


   // @ManyToOne
    //@JoinColumn(name="BstudentId", nullable=false)
    //private  StudentEntity studentEntity;



  //  @OneToMany(cascade = CascadeType.ALL, mappedBy = "bankEntity")
  //  private Set<InstituteEntity> instituteEntities;


    //Reference Relation

    //@ManyToOne
   // @JoinColumn(name="BorganizationId", nullable=false)
    //private  OrganizationInfoEntity organizationInfoEntity;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="donarId", nullable=false)
    private  DonarEntity donarEntity;



    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
/*
    public DonarEntity getDonarEntity() {
        return donarEntity;
    }

    public void setDonarEntity(DonarEntity donarEntity) {
        this.donarEntity = donarEntity;
    }*/
}
