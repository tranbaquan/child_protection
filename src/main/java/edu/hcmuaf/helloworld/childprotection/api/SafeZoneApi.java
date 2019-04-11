package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.SafeZone;
import edu.hcmuaf.helloworld.childprotection.service.SafeZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("safezone")
public class SafeZoneApi {
    @Autowired
    SafeZoneService service;


    @GetMapping
    public SafeZone retrieve(@RequestParam String id) {
        return service.retrieve(id);
    }

    @PutMapping
    public SafeZone update(@RequestBody SafeZone obj) {
        return service.update(obj);
    }

    @GetMapping("safezone")
    public boolean isSafeZone(@RequestParam String safeZoneId, @RequestParam long longtitude, @RequestParam long latitude) {
        return service.isSafe(longtitude, latitude, safeZoneId);
    }

}
