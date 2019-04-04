package edu.hcmuaf.helloworld.childprotection.repository;

import edu.hcmuaf.helloworld.childprotection.model.Parent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParentsRepository extends MongoRepository<Parent, String> {
    Parent findParentsBy_id(String id);
}
