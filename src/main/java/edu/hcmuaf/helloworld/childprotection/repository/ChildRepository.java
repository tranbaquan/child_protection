package edu.hcmuaf.helloworld.childprotection.repository;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChildRepository extends MongoRepository<Child, String> {
    Child findChildBy_id(String id);

    Child findChildByPhone(String phone);

    List<Child> findAllByParentsId(String id);
}
