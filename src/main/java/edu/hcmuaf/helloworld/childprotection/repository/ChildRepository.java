package edu.hcmuaf.helloworld.childprotection.repository;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChildRepository extends MongoRepository<Child, String> {
}
