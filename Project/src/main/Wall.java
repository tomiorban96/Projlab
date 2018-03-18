package main;

public class Wall extends Field{

    public boolean Accept(Player p, Player pusher){
        System.out.println("Wall.Accept()");
        System.out.println("Wall.Accept() returns false");
        return false;
    }

    public boolean Accept(Box b, Player pusher){
        System.out.println("Wall.Accept()");
        System.out.println("Wall.Accept() returns false");
        return false;
    }  
}
