package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.service.ChildService;
import edu.hcmuaf.helloworld.childprotection.service.Crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/child")
public class ChildApi implements Crud<Child> {
    @Autowired
    private ChildService service;

    @Override
    @PostMapping
    public Child create(@RequestBody Child obj) {
        return service.create(obj);
    }

    @Override
    @GetMapping
    public Child retrieve(@RequestParam String phone) {
        return service.findByPhone(phone);
    }

    @Override
    @PutMapping
    public Child update(@RequestBody Child obj) {
        return service.update(obj);
    }

    @Override
    @DeleteMapping
    public void delete(@RequestBody Child obj) {
        service.delete(obj);
    }


}
