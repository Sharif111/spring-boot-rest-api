package com.user.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teacher_info")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long teacherId;
    private String organizationId;
    private String teacherName;
    private String instituteId;
    private String activeStatus;
    private String department;
    private String expireDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacherEntity")
    private Set<StudentEntity> studentEntity;

    @ManyToOne
    @JoinColumn(name="TorganizationId", nullable=false)
    private   OrganizationInfoEntity organizationInfoEntity;

    @ManyToOne
    @JoinColumn(name="TinstituteId", nullable=false)
    private  InstituteEntity instituteEntity;

}
