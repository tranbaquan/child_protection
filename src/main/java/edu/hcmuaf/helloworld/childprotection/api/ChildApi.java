package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.service.Crud;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildApi implements Crud<Child> {
    @Override
    public Child create(Child obj) {
        System.out.println("abc");
        return null;
    }

    @Override
    public Child read(String id) {
        return null;
    }

    @Override
    public Child update(Child obj) {
        return null;
    }

    @Override
    public boolean delete(Child obj) {
        return false;
    }

    public boolean acceptConection() {
        return false;
    }
}
