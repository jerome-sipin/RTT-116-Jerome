package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
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
    public ModelAndView search(@RequestParam(required = false) Long id){
        ModelAndView response = new ModelAndView();

        response.setViewName("employee/search");

        response.addObject("search", id);

        if (id != null) {
            List<Employee> employees = employeeDao.findByEmployeeId(id);
            response.addObject("employeesKey", employees);
        }

        return response;
    }

}
