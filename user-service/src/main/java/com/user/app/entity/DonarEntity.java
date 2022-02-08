package com.user.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "donar_info")
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DonarEntity  extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long donarId;
    private String donarName;
    private String donarType;
    private String donarMail;
    private String donarPhoneNo;
    private String donarProfession;
    private String donarDesignation;
    private String organizationName;
    private String organizationType;
    private String organizationEstablishDate;
    private String organizationEmail;
    private String organizationPhoneNo;
    private String organizationMdEmail;
    private String organizationMdName;
    private String organizationMdPhoneNo;


   // @ManyToOne
   // @JoinColumn(name="DorganizationId", nullable=false)
   // private  OrganizationInfoEntity organizationInfoEntity;


    @OneToMany(mappedBy = "donarEntity",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BankEntity> bankEntity = new HashSet<>();


    public long getDonarId() {
        return donarId;
    }

    public void setDonarId(long donarId) {
        this.donarId = donarId;
    }

    public String getDonarName() {
        return donarName;
    }

    public void setDonarName(String donarName) {
        this.donarName = donarName;
    }

    public String getDonarType() {
        return donarType;
    }

    public void setDonarType(String donarType) {
        this.donarType = donarType;
    }

    public String getDonarMail() {
        return donarMail;
    }

    public void setDonarMail(String donarMail) {
        this.donarMail = donarMail;
    }

    public String getDonarPhoneNo() {
        return donarPhoneNo;
    }

    public void setDonarPhoneNo(String donarPhoneNo) {
        this.donarPhoneNo = donarPhoneNo;
    }

    public String getDonarProfession() {
        return donarProfession;
    }

    public void setDonarProfession(String donarProfession) {
        this.donarProfession = donarProfession;
    }

    public String getDonarDesignation() {
        return donarDesignation;
    }

    public void setDonarDesignation(String donarDesignation) {
        this.donarDesignation = donarDesignation;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrganizationEstablishDate() {
        return organizationEstablishDate;
    }

    public void setOrganizationEstablishDate(String organizationEstablishDate) {
        this.organizationEstablishDate = organizationEstablishDate;
    }

    public String getOrganizationEmail() {
        return organizationEmail;
    }

    public void setOrganizationEmail(String organizationEmail) {
        this.organizationEmail = organizationEmail;
    }

    public String getOrganizationPhoneNo() {
        return organizationPhoneNo;
    }

    public void setOrganizationPhoneNo(String organizationPhoneNo) {
        this.organizationPhoneNo = organizationPhoneNo;
    }

    public String getOrganizationMdEmail() {
        return organizationMdEmail;
    }

    public void setOrganizationMdEmail(String organizationMdEmail) {
        this.organizationMdEmail = organizationMdEmail;
    }

    public String getOrganizationMdName() {
        return organizationMdName;
    }

    public void setOrganizationMdName(String organizationMdName) {
        this.organizationMdName = organizationMdName;
    }

    public String getOrganizationMdPhoneNo() {
        return organizationMdPhoneNo;
    }

    public void setOrganizationMdPhoneNo(String organizationMdPhoneNo) {
        this.organizationMdPhoneNo = organizationMdPhoneNo;
    }

    public Set<BankEntity> getBankEntity() {
        return bankEntity;
    }

    public void setBankEntity(Set<BankEntity> bankEntity) {
        this.bankEntity = bankEntity;
    }


    public void getId() {
        return ;
    }
}
