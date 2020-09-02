package heroes;

import java.util.Random;

public class Knight extends Human {

    public Knight(String name) {
        Random random = new Random();

        this.name = "Knight " + name;
        this.power = 2 + random.nextInt(11);
        this.hp = 2 + random.nextInt(11);
    }
}
