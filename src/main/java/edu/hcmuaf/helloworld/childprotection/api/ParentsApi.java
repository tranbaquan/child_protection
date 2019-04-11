package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.model.Parent;
import edu.hcmuaf.helloworld.childprotection.model.SafeZone;
import edu.hcmuaf.helloworld.childprotection.service.Crud;
import edu.hcmuaf.helloworld.childprotection.service.ParentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parents")
public class ParentsApi implements Crud<Parent> {
    @Autowired
    private ParentsService service;

    @Override
    @PostMapping
    public Parent create(@RequestBody Parent obj) {
        return service.create(obj);
    }

    @Override
    @GetMapping
    public Parent retrieve(@RequestParam String id) {
        return service.retrieve(id);
    }

    @Override
    @PutMapping
    public Parent update(@RequestBody Parent obj) {
        return service.update(obj);
    }

    @Override
    @DeleteMapping
    public void delete(@RequestBody Parent obj) {
        service.delete(obj);
    }

    @GetMapping("all")
    public List<Child> getAll(@RequestParam String parentId) {
        return service.getAll(parentId);
    }

    @PutMapping("link")
    public boolean linkToChild(@RequestParam String parentId, @RequestParam String childId) {
        return service.linkToChild(parentId, childId);
    }

    @PostMapping("addsafe")
    public SafeZone addSafeZone(@RequestBody SafeZone safeZone) {
        return service.addSafeZone(safeZone);
    }

    @GetMapping("allsafe")
    public List<SafeZone> retriveAllSafeZone(@RequestParam String childId) {
        return service.retrieveAllSafeZone(childId);
    }

    @DeleteMapping("deletesafe")
    public void deleteSafeZone(@RequestParam String safeId, @RequestParam String childId) {
        service.deleteSafeZone(safeId, childId);
    }
}
