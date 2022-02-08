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
@Table(name = "System_group")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemGroupEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long systemGroupId;

    @Column(nullable = false)
    private long orgId;

    @Column(nullable = false)
    private String groupName;

    @Column(columnDefinition = "varchar(1024)")
    private String groupDescription;

    @Column(nullable = false)
    private String groupType;

    @Column(nullable = false, columnDefinition = "varchar(2) default 'TF'")
    private String moduleCode;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stopTime;

    //  OneToMany with SystemGroupMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemGroupEntityGM")
    private Set<SystemGroupMenuEntity> systemGroupMenuEntityGM;

    //  OneToMany with SystemUserGroupMenuEntity
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "systemGroupEntityUGM")
    private Set<SystemUserGroupMenuEntity> systemUserGroupMenuEntity;

}
