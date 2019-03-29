package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Parents;
import edu.hcmuaf.helloworld.childprotection.repository.ParentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;

@Service
public class ParentsService implements Crud<Parents> {
    @Autowired
    private ParentsRepository repository;
    @Override
    public Parents create(Parents obj) {
        return null;
    }

    @Override
    public Parents read(String id) {
        return null;
    }

    @Override
    public Parents update(Parents obj) {
        return null;
    }

    @Override
    public boolean delete(Parents obj) {
        return false;
    }
}
