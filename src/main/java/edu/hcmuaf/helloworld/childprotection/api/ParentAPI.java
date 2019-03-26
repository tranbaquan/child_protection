package edu.hcmuaf.helloworld.childprotection.api;


import edu.hcmuaf.helloworld.childprotection.model.Parent;
import edu.hcmuaf.helloworld.childprotection.service.ParentSeivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/parent")
//duong dan mapping la parent
public class ParentAPI {
    @Autowired
            //tu dong khoi tao doi tuong k can phai new ra


    ParentSeivice parentSeivice;
    @GetMapping
    //test ben postman laf pt get
    public Parent getParent(@RequestParam int id){
        return  parentSeivice.getParent(id);
    }
    @PostMapping
    //test ben postman la pt post
    public void addParent(@RequestBody Parent parent){
        parentSeivice.addParent(parent);
    }

    /*
    xu li ca pt
     */

}
