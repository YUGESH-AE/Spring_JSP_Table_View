package com.example.spring_jsp_table_view.service;

import com.example.spring_jsp_table_view.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public List<Customer> getCustomers(){
        List<Customer>list=new ArrayList<>();
        list.add(new Customer(110011L,"Ravi",21,'M',"India"));
        list.add(new Customer(110012L,"Sanjay",21,'M',"US"));
        list.add(new Customer(110013L,"Arun",21,'M',"UK"));
        list.add(new Customer(110014L,"Shyam",21,'M',"China"));
        list.add(new Customer(110015L,"Yash",21,'M',"Russia"));
        return list;
    }
}
