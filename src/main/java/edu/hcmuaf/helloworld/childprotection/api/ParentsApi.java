package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.exceptions.NotFoundException;
import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.model.Parent;
import edu.hcmuaf.helloworld.childprotection.service.ParentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parents")
public class ParentsApi {
    @Autowired
    private ParentsService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Parent obj) {
        Parent parents = service.create(obj);
        return new ResponseEntity<>(parents, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity retrieve(@RequestParam String id) {
        ResponseEntity parents = null;
        try {
            parents = new ResponseEntity(service.retrieve(id), HttpStatus.OK);
        } catch (NotFoundException e) {
            parents = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return parents;
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Parent obj) {
        ResponseEntity result;
        try {
            result = new ResponseEntity<>(service.update(obj), HttpStatus.OK);
        } catch (NotFoundException e) {
            result = ResponseEntity.notFound().build();
        }
        return result;
    }

    @DeleteMapping
    public void delete(@RequestBody Parent obj) {
        service.delete(obj);
    }

    @PostMapping("link")
    public ResponseEntity linkToChild(@RequestParam String parentsId, @RequestParam String childId) throws NotFoundException {
        return ResponseEntity.status(service.linkToChild(parentsId, childId) ? HttpStatus.OK : HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("get")
    public List<Child> getAllChild(@RequestParam String id) {
        return service.getAll(id);
    }
}
