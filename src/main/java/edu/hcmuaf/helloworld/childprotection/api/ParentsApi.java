package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.exceptions.NotFoundException;
import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.model.Parents;
import edu.hcmuaf.helloworld.childprotection.service.ParentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parents")
public class ParentsApi implements CrudApi<Parents> {
    @Autowired
    private ParentsService service;

    @Override
    @PostMapping
    public ResponseEntity<Parents> create(@RequestBody Parents obj) {
        Parents parents = service.create(obj);
        return new ResponseEntity<>(parents, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public Parents retrieve(@PathVariable String id) {
        Parents parents = service.retrieve(id);
        if (parents == null) throw new NotFoundException("Not found parents Id: " + id);
        return parents;
    }

    @Override
    @PatchMapping
    public ResponseEntity<Parents> update(@RequestBody Parents obj) {
        Parents parents = service.retrieve(obj.get_id());
        if (parents == null) {
            return ResponseEntity.badRequest().build();
        }
        return new ResponseEntity<>(service.update(obj), HttpStatus.OK);
    }

    @Override
    @DeleteMapping
    public void delete(@RequestBody Parents obj) {
        service.delete(obj);
    }

    @PostMapping("link")
    public ResponseEntity<Parents> linkToChild(@RequestParam String parentsId, @RequestParam String childId) {
        boolean result = service.linkToChild(parentsId, childId);
        if (!result) return (ResponseEntity<Parents>) ResponseEntity.status(HttpStatus.NOT_MODIFIED);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("get/{id}")
    public List<Child> getAllChild(@PathVariable String id) {
        Parents parents = retrieve(id);
        return service.getAll(id);
    }
}
