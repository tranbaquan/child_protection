package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildService implements Crud<Child>{
    @Autowired
    private ChildRepository repository;
    @Override
    public Child create(Child obj) {
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
