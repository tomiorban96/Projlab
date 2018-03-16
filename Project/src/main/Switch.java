package main;

public class Switch extends Field {

    private Hole hole;

    public boolean Accept(Player p, Player pusher){
        return false;
    }

    public boolean Accept(Box b, Player pusher){
        return false;
    }
}
