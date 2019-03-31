package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.model.Parents;
import edu.hcmuaf.helloworld.childprotection.repository.ParentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentsService implements Crud<Parents> {
    @Autowired
    private ParentsRepository repository;
    @Autowired
    private ChildService childService;

    @Override
    public Parents create(Parents obj) {
        return repository.insert(obj);
    }

    @Override
    public Parents retrieve(String id) {
        return repository.findParentsBy_id(id);
    }

    @Override
    public Parents update(Parents obj) {
        return repository.save(obj);
    }

    @Override
    public void delete(Parents obj) {
        repository.delete(obj);
    }

    @Override
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
