package heroes;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        HeroFactory heroes = new HeroFactory();
        Hero hero1 = heroes.createHero();
        Hero hero2 = heroes.createHero();
        GameManager game = new GameManager();
        game.fight(hero1, hero2);

    }
}
