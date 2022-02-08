package com.user.app.entity;

import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "document_info")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DocumentEntity extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int docId;
    private String docTitle;
    private String docType;
    private String docBlob;
    private String docDescription;
    private String documentsInfocol;


    @ManyToOne
    @JoinColumn(name="DocOrganizationId", nullable=false)
    private  OrganizationInfoEntity organizationInfoEntity;

}
