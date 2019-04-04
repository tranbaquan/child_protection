package edu.hcmuaf.helloworld.childprotection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Connection {
    private Parent parents;
    private Child child;
}
