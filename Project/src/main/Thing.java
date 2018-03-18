package main;

public abstract class Thing {

    private Field field;

    abstract void Die();

    public boolean PushedBy(Player p, Thing t, Direction d){
        System.out.println("Thing.PushedBy()");
        System.out.println("Thing.PushedBy() returns false");
        return false; 
    }
}
