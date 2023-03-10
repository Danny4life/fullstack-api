package com.osiki.fullstackapi.model;

import lombok.Data;

@Data
public class EmployeeModel {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
