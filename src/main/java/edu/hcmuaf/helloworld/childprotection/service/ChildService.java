package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import org.springframework.stereotype.Service;

@Service
public class ChildService implements Crud<Child>{
    @Override
    public Child create(Child obj) {
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
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
}
