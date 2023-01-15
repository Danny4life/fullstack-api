package com.osiki.fullstackapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
