package com.user.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "system_user_group_menu")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemUserGroupMenuEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long systemUserMenuID;

    //  ManyToOne with SystemUserEntity
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private SystemUserEntity systemUserEntityUGM;

    private String userName;

    //  ManyToOne with SystemUserEntity
    @ManyToOne
    @JoinColumn(name = "groupId", nullable = false)
    private SystemGroupEntity systemGroupEntityUGM;

    private String groupName;

    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private SystemMenuEntity systemMenuEntityGM;

    private String menuName;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String isAdd;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String isModify;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String isDelete;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String isInquiry;

}
