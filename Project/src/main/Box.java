package main;

public class Box extends Thing{

    public void Die(){

    }

    public boolean PushedBy(Player p, Thing t, Direction d){
        return false;
    }
}
