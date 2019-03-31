package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Child;

import java.util.List;

public interface Crud<T> {
    T create(T obj);

    T retrieve(String id);

    T update(T obj);

    void delete(T obj);

    List<Child> getAll(String id);
}
