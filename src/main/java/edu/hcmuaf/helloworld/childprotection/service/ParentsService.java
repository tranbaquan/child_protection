package edu.hcmuaf.helloworld.childprotection.service;

import edu.hcmuaf.helloworld.childprotection.model.Parents;
import org.springframework.stereotype.Service;

@Service
public class ParentsService implements Crud<Parents> {
    @Override
    public Parents create(Parents obj) {
        //TODO
        /*
        * kiem tra cac dk (vd:id k trung voi trong csdl)
        *if(id not exist) nhap du lieu
        * kt tính hop le cua du lieu ngdung nhap
        * if(du lieu hop le) thi tao ngdung
        * else ngdung nhap lai du lieu
        *return obj
         */

        return null;
    }

    @Override
    public Parents read(String id) {
        //TODO
        /**
         * ngdung nhap vao id
         * if(id exist) hien thi tt parent
         * else thi thong bao k co pảent

         */
        return null;
    }

    @Override
    public Parents update(Parents obj) {
        //TODO
        /**
         *nhap vao id
         * if(id exist) ngdung cap nhat tt
         * if(tt cap nhat hop le) update tt
         * else tb du lieu loi

         */
        return null;
    }

    @Override
    public boolean delete(Parents obj) {
        //TODO
        /**
         * nhap vao id
         * if(id not exist) tb id k ton tai
         * else xoa id
         */
        return false;
    }
}
