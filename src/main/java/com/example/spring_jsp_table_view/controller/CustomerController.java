package com.example.spring_jsp_table_view.controller;

import com.example.spring_jsp_table_view.entity.Customer;
import com.example.spring_jsp_table_view.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/")
    public ModelAndView indexPage(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/list_contact")
    public ModelAndView listContact(){
        ModelAndView mv=new ModelAndView();
        CustomerService customerService=new CustomerService();
        List<Customer>customerList=customerService.getCustomers();
        mv.addObject("contacts",customerList);
        mv.setViewName("contact");
        return mv;

    }
}
