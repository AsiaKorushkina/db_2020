package heroes;

import java.util.Random;

import static java.lang.Math.min;

public class Human extends Hero {

    @Override
    protected void kick(Hero c){
        Random random = new Random();

        c.hp -= min(random.nextInt(this.power + 1), c.hp);

    }
}
