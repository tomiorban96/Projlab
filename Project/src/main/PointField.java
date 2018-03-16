package main;

public class PointField extends Field {

    private boolean completed;

    public boolean Accept(Player p, Player pusher){
        return false;
    }

    public boolean Accept(Box b, Player pusher){
        return false;
    }
}
