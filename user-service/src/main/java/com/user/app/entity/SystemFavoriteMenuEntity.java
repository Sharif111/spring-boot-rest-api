package com.user.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "system_favorite_menu")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemFavoriteMenuEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long systemFavoriteMenuID;

    //  ManyToOne with SystemUserEntity
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private SystemUserEntity systemUserEntityFavorite;

    private String userName;

    //  ManyToOne with SystemMenuEntity
    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private SystemMenuEntity systemMenuEntityFavorite;

    private String menuName;

}
