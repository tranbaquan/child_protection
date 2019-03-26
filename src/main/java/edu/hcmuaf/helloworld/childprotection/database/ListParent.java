package edu.hcmuaf.helloworld.childprotection.database;


import edu.hcmuaf.helloworld.childprotection.model.Parent;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;

@Data
@AllArgsConstructor
public class ListParent {
    LinkedList<Parent> list;

    public ListParent() {
        this.list = new LinkedList<>();

    }
    /*

    public boolean create(Parent parent){

      tao 1 session
      tao 1 transaction cho = null
      khi ma session thuc thi create(.beginTransaction) thi luu session, commit lai

      -exception
      neu ma transaction k bang null thi rollback transaction
      flush,close session



    }
    public Parent read(int id){
    tao 1 session
      tao 1 transaction cho = null
      khi ma session thuc thi read(.beginTransaction) thi tra ve tt parent (.getParent), commit lai

      -exception
      neu ma transaction k bang null thi rollback transaction
      flush,close session

    }
    public bolean update
     tao 1 session
      tao 1 transaction cho = null
      khi ma session thuc thi update(.beginTransaction) thi update, commit lai
      -exception{
      neu ma transaction k bang null thi rollback transaction}
      flush,close session

 public bolean delete
     tao 1 session
      tao 1 transaction cho = null
      khi ma session thuc thi delete(.beginTransaction) thi delete, commit lai
      -exception{
      neu ma transaction k bang null thi rollback transaction}
      flush,close session
     */

}
