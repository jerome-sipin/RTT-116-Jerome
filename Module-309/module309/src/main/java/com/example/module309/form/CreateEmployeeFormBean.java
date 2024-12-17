package com.example.module309.form;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {

    private Integer id;
    private Integer officeId;
    private String firstName;
    private String lastName;
    private String extension;
    private String email;
    private String jobTitle;
}
