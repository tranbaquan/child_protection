package edu.hcmuaf.helloworld.childprotection.api;

import org.springframework.http.ResponseEntity;

public interface CrudApi<T> {
    ResponseEntity<T> create(T obj);

    T retrieve(String id);

    ResponseEntity<T> update(T obj);

    void delete(T obj);
}
