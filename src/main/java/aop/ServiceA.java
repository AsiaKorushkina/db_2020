package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    @Autowired
    Dao dao;

    public void work(){
        System.out.println("working...");
        dao.save();
    }
}
