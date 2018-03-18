package main;

import java.util.ArrayList;
import java.util.Hashtable;

public class Field {
	/**
	 * A mezőn lévő Thing amit el lehet tolni, vagy magától el tud mozogni
	 */
    protected Thing movable;
    /**
    * A mező négy irányban lévő szomszédja.
    * Lehet egy, vagy több irányban null, pl.:a pálya sarkán.
    */
    private Hashtable<Direction,Field> neighbors;

	/**
 	 * A mező konstruktora
 	 */
    public Field() {
    	
    }
	/**
	 * A mező konstruktora, kezdeti értékekkel
	 * @param movable a movable kívánt értéke
	 * @param neighbors a neighbors kívánt értéke
	 */
    public Field(Thing movable, Hashtable<Direction,Field> neighbors) {
    	this.movable=movable;
    	this.neighbors=neighbors;
    }
    /**
     * Ha a movable null, felveszi a p:Player játékost a movable tagváltozónak. Ekkor true-t ad vissza.
     * Ha a movable nem null akkor először meghívja a movable pushedBy(pusher,p,d) függvényét. Ha az true-val tér vissza
     * akkor elhelyezi a p-t a movable tagváltozóban. Ha false-al tér vissza akkor nem helyezi el p-t és false-al tér vissza.
     * @param p az a Player aki közvetlen rá akar lépni a mezőre
     * @param pusher az a Player aki eredetileg tolta a p-t
     * @param d az az irány amerre tolódnia kell a movable-nek ha az nem null
     * @return sikerült-e elhelyezni a p-t a mezőn
     */
    public boolean Accept(Player p, Player pusher, Direction d){
        System.out.println("Field.Accept()");
         if (movable!=null){                                     //van rajta valami
            if (movable.PushedBy(pusher,p,d)){                  //ha el lehet tolni
                System.out.println("Field.Accept() returns true");
                return true;
            }
            else{                                               //ha nem lehet eltolni
                System.out.println("Field.Accept() returns false");
                return false;
            }     
        }
        else{                                                   //nincs rajta semmi
            System.out.println("Field.Accept() returns true");
            return true;
        }
    }
    /**
     * Ha a moveable null, felveszi a b:Boxot a movable tagváltozónak. Ekkor true-t ad vissza.
     * Ha a movable nem null akkor először meghívja a movable pushedBy(pusher,b,d) függvényét. Ha az true-val tér vissza
     * akkor elhelyezi a b-t a movable tagváltozóban. Ha false-al tér vissza akkor nem helyezi el b-t és false-al tér vissza.
     * @param b az a Box aki közvetlen rá akar lépni a mezőre
     * @param pusher az a Player aki eredetileg tolta a b-t
     * @param d az az irány amerre tolódnia kell a movable-nek ha az nem null
     * @return sikerült-e elhelyezni a b-t a mezőn
     */
    public boolean Accept(Box b, Player pusher,Direction d){
        System.out.println("Field.Accept()");
         if (movable!=null){                                     //van rajta valami
            if (movable.PushedBy(pusher,b,d)){                  //ha el lehet tolni
                System.out.println("Field.Accept() returns true");
                return true;
            }
            else{                                               //ha nem lehet eltolni
                System.out.println("Field.Accept() returns false");
                return false;
            }     
        }
        else{                                                   //nincs rajta semmi
            System.out.println("Field.Accept() returns true");
            return true;
        }
    }
    /**
     * Kiveszi a null-al teszi egyenlővé a moveable-t, ezzel kivéve azt a mezőröl.
     * @param t az a thing amit ki kell venni a mezőröl
     */
    public void Remove(Thing t){
        System.out.println("Field.Remove()");
        System.out.println("Field.Remove() returns");
        movable=null;
    }
    /**
     * Visszaadja valamelyik irányban lévő szomszédos mezőt
     * @param d az az irány amelyik irányban lévő mezőt adja vissza
     * @return a d irányban lévő mező
     */
    public Field GetNeighbor(Direction d){
       System.out.println("Field.GetNeighbor()");
       System.out.println("Field.GetNeighbor() returns");
       return neighbors.get(d);
    }

    
    
}
