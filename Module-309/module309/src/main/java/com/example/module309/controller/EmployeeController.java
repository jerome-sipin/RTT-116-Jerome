package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import com.example.module309.form.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDao;

    @GetMapping("/employee/search")
    public ModelAndView search(@RequestParam(required = false) Integer id){
        ModelAndView response = new ModelAndView();

        response.setViewName("employee/search");

        response.addObject("search", id);

        if (id != null) {
            Employee employee = employeeDao.findById(id);
            response.addObject("employeesKey", employee);
        }

        System.out.println(response);
        return response;
    }

//    @GetMapping("/customer/search")
//    public ModelAndView search(@RequestParam(required = false) String firstName) {
//        ModelAndView response = new ModelAndView();
//
//        // /WEB-INF/jsp/customer/search.jsp
//        response.setViewName("customer/search");
//
//        // add the search field to the model so we can use it on the jsp page
//        response.addObject("search", firstName);
//
//        if ( firstName != null ) {
//            List<Employee> employees = employeeDao.findByFirstName(firstName);
//            response.addObject("customersKey", employees);
//        }
//        System.out.println(response);
//        return response;
//    }

    @GetMapping("/employee/create")
    public ModelAndView create(){
        ModelAndView response = new ModelAndView();

        response.setViewName("employee/create");

        return response;
    }

    @GetMapping("/employee/createEmployee")
    public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form){
        ModelAndView response = new ModelAndView();
        response.setViewName("employee/createEmployee");
        System.out.println(form);

        Employee employee = new Employee();
        employee.setId(form.getId());
        employee.setOfficeId(form.getOfficeId());
        employee.setFirstname(form.getFirstName());
        employee.setLastname(form.getLastName());
        employee.setExtension(form.getExtension());
        employee.setEmail(form.getEmail());
        employee.setJobTitle(form.getJobTitle());

        employeeDao.save(employee);

        return response;
    }

}
