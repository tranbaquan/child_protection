package edu.hcmuaf.helloworld.childprotection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "parents")
public class Parent {
    @Id
    private String _id;
    private String name;
    private String phone;
    private String email;
    private String password;
    private String role;
}
