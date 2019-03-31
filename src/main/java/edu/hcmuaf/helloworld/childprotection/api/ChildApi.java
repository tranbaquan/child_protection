package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.exceptions.NotFoundException;
import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/child")
public class ChildApi implements CrudApi<Child> {
    @Autowired
    private ChildService service;

    @Override
    @PostMapping
    public ResponseEntity<Child> create(@RequestBody Child obj) {
        Child child = service.create(obj);
        return new ResponseEntity<>(child, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public Child retrieve(@PathVariable String id) {
        Child child = service.retrieve(id);
        if (child == null) throw new NotFoundException("Not found child Id: " + id);
        return child;
    }

    @Override
    @PatchMapping
    public ResponseEntity<Child> update(@RequestBody Child obj) {
        Child child = service.retrieve(obj.get_id());
        if (child == null) {
            return ResponseEntity.badRequest().build();
        }
        return new ResponseEntity<>(service.update(obj), HttpStatus.OK);
    }

    @Override
    @DeleteMapping
    public void delete(@RequestBody Child obj) {
        service.delete(obj);
    }
}
