package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import edu.hcmuaf.helloworld.childprotection.service.Crud;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildApi implements Crud<Child> {
    @Override
    public Child create(Child obj) {
        //TO DO
        /**
         * input: obj
         * if obj is  null return error
         * if obj exist in db return error
         * return insert obj
         * */
        return null;
    }

    @Override
    public Child read(String id) {
        //TO DO
        /**
         * input: id
         * if id exist in db return child
         * return error
         * */
        return null;
    }

    @Override
    public Child update(Child obj) {
        //TO DO
        /**
         * input: obj
         * if obj is  null return error
         * return save obj
         * */
        return null;
    }

    @Override
    public boolean delete(Child obj) {
        //TO DO
        /**
         * input: obj
         * if obj is  null return false
         * return delete obj
         * */
        return false;
    }

    public boolean acceptConection() {
        //TO DO
        /**
         * input: connection
         * if connection is null return false
         * return set connection for child
         * */
        return false;
    }
}
