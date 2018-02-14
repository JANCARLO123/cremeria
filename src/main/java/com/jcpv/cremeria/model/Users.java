package com.jcpv.cremeria.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by jancarlo on 14/02/18.
 */
@Data
@Entity
@Table(name = "users",uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    private Boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private List<Roles> roles;

}
