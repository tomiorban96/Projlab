package main;

import java.util.ArrayList;

public class Field {

    protected ArrayList<Thing> movable;
    private Field neighbor[];

    public boolean Accept(Player p, Player pusher, Direction d){
        return false;
    }

    public boolean Accept(Box b, Player pusher){
        return false;
    }

    public void Remove(Thing t){

    }

    public Field GetNeighbor(Direction d){
        return neighbor[d.ordinal()];
    }

    Field(){
        movable = new ArrayList<>();
        neighbor = new Field[4];
    }
}
