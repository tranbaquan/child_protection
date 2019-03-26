package edu.hcmuaf.helloworld.childprotection.service;


import edu.hcmuaf.helloworld.childprotection.database.ListParent;
import edu.hcmuaf.helloworld.childprotection.model.Parent;
import org.springframework.stereotype.Service;

@Service
public class ParentSeivice {
    ListParent listP = new ListParent();
    public void addParent(Parent parent){
        listP.getList().add(parent);


    }
    public Parent getParent(int id){
        for (Parent parent : listP.getList()){
            if (parent.getId()==id){
                return parent;
            }
        }
        return null;
    }
    /*
    pt create,update,delete,read
    public boolean create(Parent parent){
    }...
     */

}
