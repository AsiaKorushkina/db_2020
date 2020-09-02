package heroes;

import java.util.Random;

public class Elf extends Hero {

    public Elf() {
        Random random = new Random();

        this.name = "Elf";
        this.power = 10;
        this.hp = 10;

    }

    @Override
    protected void kick(Hero c) {
        if (power > c.power){
            c.hp = 0;
        }
        else {
            c.power--;
        }
    }
}
