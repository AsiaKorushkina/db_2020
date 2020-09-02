package heroes;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        HeroFactory heroes = new HeroFactory();
        Hero hero1 = heroes.createHero("Vasya");
        Hero hero2 = heroes.createHero("Kolya");
        GameManager game = new GameManager();
        game.fight(hero1, hero2);

    }
}
