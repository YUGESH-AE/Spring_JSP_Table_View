package com.example.spring_jsp_table_view.entity;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long phone;
    private String name;
    private Integer age;
    private Character gender;
    private String address;
}
