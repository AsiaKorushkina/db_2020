package heroes;


public abstract class Hero {
    protected String name;
    protected int power;
    protected int hp;

    abstract void kick(Hero c);

    boolean isAlive(){
        return hp > 0;
    }

}
