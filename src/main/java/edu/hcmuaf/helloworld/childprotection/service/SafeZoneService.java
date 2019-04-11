package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.SafeZone;
import edu.hcmuaf.helloworld.childprotection.repository.SafeZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SafeZoneService {
    @Autowired
    SafeZoneRepository repository;


    public SafeZone create(SafeZone obj) {
        return repository.insert(obj);
    }


    public SafeZone retrieve(String id) {
        Optional<SafeZone> result = repository.findById(id);
        return result.isPresent() ? result.get() : null;
    }

    public List<SafeZone> retrieveAllSaveZone(String childId) {
        return repository.findAllByChildId(childId);
    }

    public SafeZone update(SafeZone obj) {
        return repository.save(obj);
    }


    public void delete(String id, String childId) {
        repository.deleteByIdAndAndChildId(id, childId);
    }

}
