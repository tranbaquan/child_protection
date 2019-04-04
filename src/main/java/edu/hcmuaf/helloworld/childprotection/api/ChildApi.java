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
public class ChildApi {
    @Autowired
    private ChildService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Child obj) {
        Child child = service.create(obj);
        return new ResponseEntity<>(child, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity retrieve(@RequestParam String id) {
        ResponseEntity child = null;
        try {
            child = new ResponseEntity(service.retrieve(id), HttpStatus.OK);
        } catch (NotFoundException e) {
            child = ResponseEntity.badRequest().build();
        }
        return child;
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Child obj) {
        ResponseEntity result;
        try {
            result = new ResponseEntity<>(service.update(obj), HttpStatus.OK);
        } catch (NotFoundException e) {
            result = ResponseEntity.notFound().build();
        }
        return result;
    }

    @DeleteMapping
    public void delete(@RequestBody Child obj) {
        service.delete(obj);
    }
}
