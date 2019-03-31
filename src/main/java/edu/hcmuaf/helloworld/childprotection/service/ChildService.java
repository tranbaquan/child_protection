package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService implements Crud<Child> {
    @Autowired
    private ChildRepository repository;

    @Override
    public Child create(Child obj) {
        return repository.save(obj);
    }

    @Override
    public Child retrieve(String id) {
        return repository.findChildBy_id(id);
    }

    @Override
    public Child update(Child obj) {
        return repository.save(obj);
    }


    @Override
    public void delete(Child obj) {
        repository.delete(obj);
    }

    @Override
    public List<Child> getAll(String id) {
        return repository.findAllByParentsId(id);
    }

}
