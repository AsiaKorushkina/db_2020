package heroes;

import java.util.Random;

public class King extends Human {

    public King(String name) {
        Random random = new Random();

        this.name = "King " + name;
        this.power = 5 + random.nextInt(11);
        this.hp = 5 + random.nextInt(11);

    }

}
