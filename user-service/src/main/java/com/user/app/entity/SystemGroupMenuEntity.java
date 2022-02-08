package com.user.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "system_group_menu")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemGroupMenuEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long systemGroupMenuId;

    //  ManyToOne with SystemMenuEntity
    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private SystemMenuEntity systemMenuEntityGM;

    private String menuName;

    //  ManyToOne with SystemGroupEntity
    @ManyToOne
    @JoinColumn(name = "groupId", nullable = false)
    private SystemGroupEntity systemGroupEntityGM;

    private String groupName;


}
