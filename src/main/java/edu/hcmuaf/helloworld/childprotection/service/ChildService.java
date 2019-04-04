package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.exceptions.NotFoundException;
import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService implements Crud<Child> {
    @Autowired
    private ChildRepository repository;

    public Child create(Child obj) {
        return repository.save(obj);
    }

    public Child retrieve(String id) throws NotFoundException {
        Child child = repository.findChildBy_id(id);
        if (child == null) {
            throw new NotFoundException("Invalid id: " + id);
        }
        return child;
    }

    public Child update(Child obj) throws NotFoundException {
        if (obj.get_id() == null) {
            throw new NotFoundException("Can not update this child");
        }
        return repository.save(obj);
    }


    public void delete(Child obj) {
        repository.delete(obj);
    }

    public List<Child> getAll(String id) {
        return repository.findAllByParentsId(id);
    }

}
