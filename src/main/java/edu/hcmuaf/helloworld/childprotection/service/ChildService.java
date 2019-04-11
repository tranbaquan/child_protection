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
    @Autowired
    private SafeZoneService safeZoneService;

    public Child create(Child obj) {
        return repository.save(obj);
    }

    public Child retrieve(String id) {
        return repository.findChildBy_id(id);

    }

    public Child update(Child obj) {
        return repository.save(obj);
    }

    public void delete(Child obj) {
        repository.delete(obj);
    }

    public List<Child> getAll(String id) {
        return repository.findAllByParentsId(id);
    }

}
