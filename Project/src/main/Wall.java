package main;

public class Wall extends Field{
	/**
     * A Wall ra se Box se Player nem léphet ezért mindig false-t ad vissza.
     * @param p a Player aki a Wall-ra akart lépni
     * @param pusher a játékos aki p-t tolja (pusher==p lehet)
     * @return false
     */
    public boolean Accept(Player p, Player pusher){
        System.out.println("Wall.Accept()");
        System.out.println("Wall.Accept() returns false");
        return false;
    }
    /**
     * A Wall ra se Box se Player nem léphet ezért mindig false-t ad vissza.
     * @param b a Box aki a Wall-ra akart lépni
     * @param pusher a játékos aki b-t tolja
     * @return false
     */
    public boolean Accept(Box b, Player pusher){
        System.out.println("Wall.Accept()");
        System.out.println("Wall.Accept() returns false");
        return false;
    }  
}
