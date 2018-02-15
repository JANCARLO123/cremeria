package com.jcpv.cremeria.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by jancarlo on 15/02/18.
 */
@Data
@Entity
@Table(name="Prueba")
public class Prueba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
}
