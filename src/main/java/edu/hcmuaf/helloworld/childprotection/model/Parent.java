package edu.hcmuaf.helloworld.childprotection.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Parent {
    int id;
    String name;
    int age;
    String phoneNumber;
}
