package com.user.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student_info")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String organizationId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private String disabilityStatus;
    private String dob;
    private String religion;
    private String orphan;
    private String benefactor;
    private String fatherName;
    private String motherName;
    private String fatherProfession;
    private String fatherDesignation;
    private String motherProfession;
    private String motherDesignation;
    private String siblings;
    private String monthlyIncome;
    private String maritalStatus;
    private String profession;
    private String designation;
    private String spouseName;
    private String spouseProfession;
    private String spouseDesignation;
    private String monthlyIncomeSelf;
    private String clientGroup;
    private String clientClass;
    private String education;
    private String instituteId;
    private String teacherId;
    private String donarPreferenceId;
    private String preferAreaDonet;
    private String priorityType;
    private String bankInfo;
    private String photo;
    private String actFlg;


    @ManyToOne
    @JoinColumn(name="SinstituteId", nullable=false)
    private  InstituteEntity instituteEntity;

    @ManyToOne
    @JoinColumn(name="SteacherId", nullable=false)
    private  TeacherEntity teacherEntity;


    @ManyToOne
    @JoinColumn(name="SorganizationId", nullable=false)
    private  OrganizationInfoEntity organizationInfoEntity;



   // @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentEntity")
   // private Set<BankEntity> bankEntities;

  //  @JoinColumn(name="s_instituteId", nullable=false)
  //  private  InstituteEntity instituteEntity;

}
