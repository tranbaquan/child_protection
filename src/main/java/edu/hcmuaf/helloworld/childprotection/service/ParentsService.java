package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Parents;
import org.springframework.stereotype.Service;

@Service
public class ParentsService implements Crud<Parents> {
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
