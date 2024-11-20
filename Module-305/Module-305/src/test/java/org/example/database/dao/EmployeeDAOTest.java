package org.example.database.dao;

import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeDAOTest {

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    @Test
    public void findByIdTest() {
        // given
        int givenEmployee = 1165;

        // when
        Employee actual = employeeDAO.findById(givenEmployee);

        // then
        Assertions.assertEquals(givenEmployee, actual.getId());


    }

    @Test
    public void findByNameTest() {
        // given
        String givenName = "Leslie";

        // when
        // probably get the first index, since this returns in a list.
        //Employee actual = employeeDAO.findByFirstName(givenName);

        // then
        //Assertions.assertEquals(givenName,actual.getFirstname());


    }



}
