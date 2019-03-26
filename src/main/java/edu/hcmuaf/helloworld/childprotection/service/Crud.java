package edu.hcmuaf.helloworld.childprotection.service;

public interface Crud<T> {
    T create(T obj);
    T read(String id);
    T update(T obj);
    boolean delete(T obj);
}
