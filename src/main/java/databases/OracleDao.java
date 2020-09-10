package databases;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;

@Repository
@Oracle
public class OracleDao implements Dao {
    @Override
    public void save() {
        System.out.println("OracleDao is saved.");
    }
}
