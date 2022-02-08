package com.user.app.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "organizationInfo")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrganizationInfoEntity extends CommonEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long organizationId;
    private String organizationName;
    private String organizationEmail;
    private String organizationPhoneNo;
    private String organizationMdName;
    private String organizationMdEmail;
    private String organizationAddressReference;


/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizationInfoEntity")
    private Set<StudentEntity> studentEntity;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizationInfoEntity")
    private Set<TeacherEntity> teacherEntities;

    //Connect InstituteEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizationInfoEntity")
    private Set<InstituteEntity> instituteEntities;


    //Connect DocumentEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizationInfoEntity")
    private Set<DocumentEntity> documentEntities;


    //Reference Relation
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizationInfoEntity")
    private Set<BankEntity> bankEntities;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizationInfoEntity")
    private Set<DonarEntity> donarEntities;
    */
}
