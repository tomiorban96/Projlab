package main;

import java.util.ArrayList;

public class Field {

    private ArrayList<Thing> movable;
    private Field[] neighbor;

    public boolean Accept(Player p, Player pusher){
        return false;
    }

    public boolean Accept(Box b, Player pusher){
        return false;
    }
}
