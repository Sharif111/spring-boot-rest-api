package com.user.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "system_recent_menu")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemRecentMenuEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long systemRecentMenuID;

    //  ManyToOne with SystemUserEntity
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private SystemUserEntity systemUserEntityRecent;

    private String userName;

    //  ManyToOne with SystemMenuEntity
    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private SystemMenuEntity SystemMenuEntityRecent;

    private String menuName;
}
