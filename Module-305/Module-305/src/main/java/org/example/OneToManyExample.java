package org.example;

import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;

public class OneToManyExample {

    public static void main( String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO();

        // when this is run, hibernate runs an actual query
        Employee e = employeeDAO.findById(1501);
        System.out.println(e);

        // I am asking the database for the list of customers for this employee
        for (Customer c : e.getCustomers()) {
            System.out.println(c);

            System.out.println(c.getEmployee());
        }

//        // add a new customer to this employee using hibernate
//        Customer newCustomer = new Customer();
//        newCustomer.setCustomerName("New Customer");
//        newCustomer.setContactFirstname("Pingas");
//        newCustomer.setContactLastname("Tingas");
//        newCustomer.setPhone("555555512");
//        newCustomer.setAddressLine1("123 pingas street");
//        newCustomer.setAddressLine2("123 pingas street");
//        newCustomer.setCity("New York City");
//        newCustomer.setState("New York");
//        newCustomer.setCountry("USA");
//        newCustomer.setPostalCode("12345");
//        newCustomer.setCreditLimit(234.33);
//        // one of the gotchas is that yyo have to set the employee on the new customer even though
//        // you are adding the customer to the list of customers in the next line of code
//        newCustomer.setEmployee(e);
//
//        // then we can add the new customer to the list of existing customers for this employee
//        e.getCustomers().add(newCustomer);
//
//        // then we will save employee
//        employeeDAO.update(e);

    }
}