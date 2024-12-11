package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    // essentially, spring boot has created the DAO for us
    // and it is already in memory, so all we have to do is to
    // autowire it. this is analogous to creating a new DAO in module 305.
    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView response = new ModelAndView();

        // this is our index.jsp file (under webapp/web-inf/jsp/index.jsp)
        response.setViewName("index");

        List<Customer> firstNames = customerDAO.findByFirstName("Alexander");
        for (Customer c : firstNames) {
            System.out.println(c.toString());
        }

        return response;
    }

}
