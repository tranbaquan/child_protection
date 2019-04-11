package edu.hcmuaf.helloworld.childprotection.repository;

import edu.hcmuaf.helloworld.childprotection.model.SafeZone;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SafeZoneRepository extends MongoRepository<SafeZone, String> {
    void deleteByIdAndAndChildId(String id, String childId);

    List<SafeZone> findAllByChildId(String childId);
}
