package com.user.app.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "system_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemUserEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;


    private String userName;
    private String userPassword;
    private String passwordDate;
    private String validateFlag;
    private String groupCode;

//    Reference id of the user that may be student, teacher, institute, donor etc.
    private long userReferenceId;

    private String userType;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLogin;

    private int loginCount;
    private int validLoginCount;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stopTime;

    private String phoneNo;
    private String address1;
    private String address2;
    private String address3;
    private String emailId1;
    private String emailId2;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startUseFromDate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stopUseFromDate;

    private int liveLogin;
    private int maximumLogin;
    private int idleTime;
    private int userLevel;
    private String isAdmin;


    //  OneToMany with SystemFavoriteMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemUserEntityFavorite")
    private Set<SystemFavoriteMenuEntity> systemFavoriteMenuEntity;

    //  OneToMany with SystemRecentMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemUserEntityRecent")
    private Set<SystemRecentMenuEntity> systemRecentMenuEntity;

    //  OneToMany with SystemUserGroupMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemUserEntityUGM")
    private Set<SystemUserGroupMenuEntity> systemUserGroupMenuEntity;

}
