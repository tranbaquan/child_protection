package edu.hcmuaf.helloworld.childprotection.service;

public interface Crud<T> {
    T create(T obj);

    T retrieve(String id);

    T update(T obj);

    void delete(T obj);
}
