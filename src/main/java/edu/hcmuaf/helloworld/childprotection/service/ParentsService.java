package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.model.Parent;
import edu.hcmuaf.helloworld.childprotection.model.SafeZone;
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
    @Autowired
    private SafeZoneService safeZoneService;

    public Parent create(Parent obj) {
        return repository.insert(obj);
    }

    public Parent retrieve(String id) {
        return repository.findParentsBy_id(id);
    }

    public Parent update(Parent obj) {
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
        Parent parent = retrieve(parentsId);
        if (parent == null && child == null && !child.get_id().isEmpty()) return false;
        child.setParentsId(parentsId);
        childService.update(child);
        return true;
    }

    public SafeZone addSafeZone(SafeZone safeZone) {
        return safeZoneService.create(safeZone);
    }

    public List<SafeZone> retrieveAllSafeZone(String childId) {
        return safeZoneService.retrieveAllSaveZone(childId);
    }

    public void deleteSafeZone(String safeZoneId, String childId) {
        safeZoneService.delete(safeZoneId, childId);
    }

}
