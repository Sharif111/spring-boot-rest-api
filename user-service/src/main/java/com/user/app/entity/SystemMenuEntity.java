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
@Table(name = "system_menu")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemMenuEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long menuId;

    @Column(nullable = false)
    private long orgId;

    @Column(nullable = false)
    private String menuName;

    private String menuDescription;

    private String menuType;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'TF'")
    private String moduleCode;

    private String pathCode;

    //    @Column(length = 1024)
    @Column(columnDefinition = "varchar(1024)")
    private String helpText;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String validateFlag;

    private String password;

    @Column(nullable = false)
    private String screenPassword;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stopTime;

    private int sysCount;

    @Column(nullable = false)
    private String appFlag;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String isAdd;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String isModify;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String isDelete;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String isInquiry;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String accessAllowed;

    //  OneToMany with SystemFavoriteMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemMenuEntityFavorite")
    private Set<SystemFavoriteMenuEntity> systemFavoriteMenuEntity;

    //  OneToMany with SystemRecentMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "SystemMenuEntityRecent")
    private Set<SystemRecentMenuEntity> systemRecentMenuEntity;

    //  OneToMany with SystemGroupMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemMenuEntityGM")
    private Set<SystemGroupMenuEntity> systemGroupMenuEntityGM;


    //  OneToMany with SystemUserGroupMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemGroupEntityUGM")
    private Set<SystemUserGroupMenuEntity> systemUserGroupMenuEntityUGM;
}
