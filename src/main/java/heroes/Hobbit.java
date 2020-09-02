package heroes;

public class Hobbit extends Hero{

    public Hobbit() {
        this.name = "Hobbit";
        this.power = 0;
        this.hp = 3;
    }

    @Override
    public void kick(Hero c) {
        toCry();
    }

    private void toCry() {
        System.out.println("I am crying!");
    }
}
