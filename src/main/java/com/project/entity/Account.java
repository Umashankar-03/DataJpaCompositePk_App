package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "account_tbl")
public class Account {

    private String holderName;
    private String branch;

    @CreationTimestamp
    @Column(name = " date_created", updatable = false)
    private LocalDate dateCreated;
    @UpdateTimestamp
    @Column(name = "last_update", insertable = false)
    private LocalDate lastUpdate;


    @EmbeddedId
    private AccountPK accountPK;


}
