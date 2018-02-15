package com.jcpv.cremeria.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by jancarlo on 15/02/18.
 */
@Data
@Entity
@Table(name="Article")
public class Article {

    @Id
    @Column(name = "id")
    @NotNull
    private int id;

    private String name;

    private String description;


}
