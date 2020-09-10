package databases;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Derby
public class DerbyDao implements Dao {
    @Override
    public void save() {
        System.out.println("DerbyDao is saved");
    }
}
