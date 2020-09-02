package heroes;

import java.util.Random;

public class King extends Human {

    public King() {
        Random random = new Random();

        this.name = "King ";
        this.power = 5 + random.nextInt(11);
        this.hp = 5 + random.nextInt(11);

    }

}
