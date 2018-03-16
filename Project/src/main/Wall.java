package main;

public class Wall extends Field{

    public boolean Accept(Player p, Player pusher){
        return false;
    }

    public boolean Accept(Box b, Player pusher){
        return false;
    }
}
