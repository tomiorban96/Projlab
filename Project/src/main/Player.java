package main;

public class Player extends Thing{

    private int points;

    public void Move(Direction d){

    }

    public void Die(){

    }

    public boolean PushedBy(Player p, Thing t, Direction d){
        return false;
    }

    public int GetPoint(){
        return points;
    }

    public void AddPoint(){
        points++;
    }
}
