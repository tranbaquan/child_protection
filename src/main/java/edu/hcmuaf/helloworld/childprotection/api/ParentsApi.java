package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.Parents;
import edu.hcmuaf.helloworld.childprotection.service.Crud;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParentsApi implements Crud<Parents> {

    @Override
    public Parents create(Parents obj) {
        return null;
    }

    @Override
    public Parents read(String id) {
        return null;
    }

    @Override
    public Parents update(Parents obj) {
        return null;
    }

    @Override
    public boolean delete(Parents obj) {
        return false;
    }

    public boolean pairWithChild(String childId) {
        return false;
    }
}
