package main;

public abstract class Thing {

    Field field;

    abstract void Die();

    public boolean PushedBy(Player p, Thing t, Direction d){
        return false;
    }
}