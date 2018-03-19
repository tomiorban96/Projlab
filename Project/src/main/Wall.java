package main;

public class Wall extends Field{

    @Override
    public boolean Accept(Player p, Player pusher, Direction d){
        System.out.println("Wall.Accept()");
        System.out.println("Wall.Accept() returns false");
        return false;
    }

    public boolean Accept(Box b, Player pusher, Direction d){
        System.out.println("Wall.Accept()");
        System.out.println("Wall.Accept() returns false");
        return false;
    }  
}
