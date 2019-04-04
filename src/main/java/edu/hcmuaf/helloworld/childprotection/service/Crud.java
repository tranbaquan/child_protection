package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.exceptions.NotFoundException;
import edu.hcmuaf.helloworld.childprotection.model.Child;

import java.util.List;

public interface Crud<T> {
    T create(T obj);

    T retrieve(String id) throws NotFoundException;

    T update(T obj) throws NotFoundException;

    void delete(T obj);

    List<Child> getAll(String id);
}
