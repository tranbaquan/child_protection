package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.service.Crud;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/child")
public class ChildApi implements Crud<Child> {

    @Override
    @PostMapping
    public Child create(@RequestBody Child child) {
        //TODO
        /* input: obj
         * if obj is  null return error
         * if obj exist in db return error
         * return insert obj
         * */
        return null;
    }

    @Override
    @GetMapping
    public Child read(@RequestParam String id) {
        //TODO
        /* input: id
         * if id exist in db return child
         * return error
         * */
        return null;
    }

    @Override
    @PutMapping
    public Child update(@RequestBody Child child) {
        //TODO
        /*
         * input: obj
         * if obj is  null return error
         * return save obj
         * */
        return null;
    }

    @Override
    @DeleteMapping
    public boolean delete(@RequestBody Child child) {
        //TODO
        /* input: obj
         * if obj is  null return false
         * return delete obj
         */
        return false;
    }

    @PostMapping("link")
    public boolean acceptConnection() {
        //TODO
        /* input: connection
         * if connection is null return false
         * return set connection for child
         */
        return false;
    }
}
