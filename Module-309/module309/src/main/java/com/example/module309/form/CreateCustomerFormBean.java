package com.example.module309.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {

    // tis is called a POJO - Plain Old Java Object
    // this object is called a FormBean
    // this is analogous to a DTO (Data Transport Object)
    // this is NEVER EVER an entity
    // the variable names here NEED TO MATCH EXACTLY what is in the name attribute
    // on the HTML input field

    private String companyName;
    private String firstName;
    private String lastName;
    private String phone;
    private String addressLine1;
    private String city;
    private String country;

}
