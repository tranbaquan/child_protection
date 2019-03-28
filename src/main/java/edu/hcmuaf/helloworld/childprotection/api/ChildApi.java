package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.service.Crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/child")
public class ChildApi implements Crud<Child> {

    @Override
    @PostMapping
    public Child create(@RequestBody Child child) {
        return null;
    }

    @Override
    @GetMapping
    public Child read(@RequestParam String id) {
        return null;
    }

    @Override
    @PutMapping
    public Child update(@RequestBody Child child) {
        return null;
    }

    @Override
    @DeleteMapping
    public boolean delete(@RequestBody Child child) {
        return false;
    }

    @PostMapping("link")
    public boolean acceptConnection() {
        return false;
    }
}
