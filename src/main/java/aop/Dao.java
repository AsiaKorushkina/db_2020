package aop;

import org.springframework.stereotype.Component;

@Component
public class Dao {

    public void save() {
        System.out.println("saving...");
        throw new DatabaseRuntimeException("Everything is broken");
    }
}
