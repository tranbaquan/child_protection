package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.exceptions.NotFoundException;
import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.model.Parent;
import edu.hcmuaf.helloworld.childprotection.repository.ParentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentsService implements Crud<Parent> {
    @Autowired
    private ParentsRepository repository;
    @Autowired
    private ChildService childService;

    public Parent create(Parent obj) {
        return repository.insert(obj);
    }

    public Parent retrieve(String id)  {
        Parent parent;
        try {
            parent = repository.findParentsBy_id(id);
        } catch (Exception e) {
            throw new NotFoundException("Invalid id: " + id);
        }
        return parent;

    }

    public Parent update(Parent obj) {
        if (obj.get_id() == null) throw new NotFoundException("Not found parent");
        return repository.save(obj);
    }

    public void delete(Parent obj) {
        repository.delete(obj);
    }

    public List<Child> getAll(String id) {
        return childService.getAll(id);
    }

    public boolean linkToChild(String parentsId, String childId) {
        Child child = childService.retrieve(childId);
        if (child == null || retrieve(parentsId) == null) return false;
        child.setParentsId(parentsId);
        childService.update(child);
        return true;
    }
}
