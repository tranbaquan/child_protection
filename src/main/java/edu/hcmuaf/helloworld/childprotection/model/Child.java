package edu.hcmuaf.helloworld.childprotection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "child")
public class Child {
    @Id
    private String _id;
    private String name;
    private String phone;
    private Date dateOfBirth;
    private String role;
    private String parentsId;
    private List<SafeZone> safeZone;
}
