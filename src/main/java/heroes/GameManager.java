package heroes;

public class GameManager {
    public void fight(Hero c1, Hero c2) {
        System.out.println("The fight began");
        while (c1.isAlive() && c2.isAlive()){
            System.out.println(c1.name + " has " + c1.hp  + " hp and " + c1.power + " power.");
            System.out.println(c2.name + " has " + c2.hp  + " hp and " + c2.power + " power.");
            System.out.println(c1.name + " kicks " + c2.name);
            c1.kick(c2);
            if (!c1.isAlive() || !c2.isAlive()){
                break;
            }
            System.out.println(c1.name + " has " + c1.hp  + " hp and " + c1.power + " power.");
            System.out.println(c2.name + " has " + c2.hp  + " hp and " + c2.power + " power.");
            System.out.println(c2.name + " kicks " + c1.name);
            c2.kick(c1);
        }
        if (c1.isAlive()) {
            System.out.println(c1.name + " won!");
        }
        else{
            System.out.println(c2.name + " won!");
        }
    }
}
