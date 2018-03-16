package main;

public class Hole extends Field {

    private boolean open;

    public boolean Accept(Player p, Player pusher){
        return false;
    }

    public boolean Accept(Box b, Player pusher){
        return false;
    }

    public boolean GetOpen(){
        return open;
    }

    public void SetOpen(boolean b){
        open = b;
    }
}
