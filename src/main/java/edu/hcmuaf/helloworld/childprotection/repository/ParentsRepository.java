package edu.hcmuaf.helloworld.childprotection.repository;

import edu.hcmuaf.helloworld.childprotection.model.Parents;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParentsRepository extends MongoRepository<Parents, String> {
    Parents findParentsBy_id(String id);
}
