package main;

public abstract class Thing {

    protected Field field;
    protected Game game;

    abstract void Die(); 

    public boolean PushedBy(Player p, Thing t, Direction d){
        System.out.println("Thing.PushedBy()");
        System.out.println("Thing.PushedBy() returns false");
        return false; 
    }
}
