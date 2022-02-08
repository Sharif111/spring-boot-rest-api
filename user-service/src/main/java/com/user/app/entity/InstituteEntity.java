package com.user.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "institute_info")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InstituteEntity extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long instituteId;
    private String instituteName;
    private String divisionCode;
    private String districtCode;
    private String thanaCode;
    private String unionCode;
    private String establishYear;
    private String insAddress;
    private String studyClsFrom;
    private String studyClsTo;
    private String teacherNumber;
    private String maleStudent;
    private String femaleStudent;
    private String facilities;
    private String lastYearResult;
    private String remarks;
    private String actFlg;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instituteEntity")
    private Set<StudentEntity> studentEntity;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instituteEntity")
    private Set<TeacherEntity> teacherEntities;


    @ManyToOne
    @JoinColumn(name="organizationId", nullable=false)
    private  OrganizationInfoEntity organizationInfoEntity;



    @ManyToOne
    @JoinColumn(name="bankId", nullable=false)
    private  BankEntity bankEntity;


}
