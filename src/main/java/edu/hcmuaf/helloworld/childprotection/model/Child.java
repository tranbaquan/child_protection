package edu.hcmuaf.helloworld.childprotection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Child {
    private String id;
    private String name;
    private int dob;
    private String phoneNumber;
}
