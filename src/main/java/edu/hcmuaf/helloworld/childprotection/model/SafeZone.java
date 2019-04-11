package edu.hcmuaf.helloworld.childprotection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Document(collection = "safezone")
public class SafeZone {
    @Id
    private String id;
    private long longitude;
    private long latitude;
    private long rad;
    private String name;
    private String childId;
}
