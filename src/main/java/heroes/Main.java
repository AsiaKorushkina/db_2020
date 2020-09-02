package heroes;

public class Main {
    public static void main(String[] args) {
        HeroFactory heroes = new HeroFactory();
        Hero hero1 = heroes.createHero("1");
        Hero hero2 = heroes.createHero("2");
        GameManager game = new GameManager();
        game.fight(hero1, hero2);

    }
}
