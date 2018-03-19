package main;

public class Switch extends Field {
	/**
	 * A Hole amit a Switch vezérel
	 */
    private Hole hole;
    /**
	 * @return the hole
	 */
	public Hole getHole() {
		return hole;
	}
	/**
	 * @param hole the hole to set
	 */
	public void setHole(Hole hole) {
		this.hole = hole;
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
        System.out.println("Switch.Accept()");
        if (movable!=null){                                     //ha van rajta valami
            if (movable.PushedBy(pusher,p,d)){                  //ha azt el lehet tolni
                System.out.println("Switch.Accept() returns true");
                return true;     
            }
            else{                                               //ha azt nem lehet eltolni 
                System.out.println("Switch.Accept() returns false");             
                return false;
            }
        }
        else{                                                  //ha nincs rajta semmi
            System.out.println("Switch.Accept() returns true");
            return true;
        }
    }
    /**
     * Ha a moveable null, felveszi a b:Boxot a movable tagváltozónak. A hole állapotát nyitottra állítja. Ekkor true-t ad vissza.
     * Ha a movable nem null akkor először meghívja a movable pushedBy(pusher,b,d) függvényét. Ha az true-val tér vissza
     * akkor elhelyezi a b-t a movable tagváltozóbanés a hole állapotát nyitottra állítja.
     * Ha false-al tér vissza akkor nem helyezi el b-t és false-al tér vissza.
     * @param b az a Box aki közvetlen rá akar lépni a mezőre
     * @param pusher az a Player aki eredetileg tolta a b-t
     * @param d az az irány amerre tolódnia kell a movable-nek ha az nem null
     * @return sikerült-e elhelyezni a b-t a mezőn
     */
    public boolean Accept(Box b, Player pusher, Direction d){
        System.out.println("Switch.Accept()");
        if (movable!=null){                                     //ha van rajta valami
            if (movable.PushedBy(pusher,b,d)){                  //ha azt el lehet tolni
                hole.SetOpen(true);
                System.out.println("Switch.Accept() returns true");
                return true;
            }
            else {                                              //ha azt nem lehet eltolni
                System.out.println("Switch.Accept() returns false");
                return false;
            }
        } 
        else {                                                  //ha nincs rajta semmi
            hole.SetOpen(true);
            System.out.println("Switch.Accept() returns true");
            return true;
        }
    }
    /**
    * Kiveszi a null-al teszi egyenlővé a moveable-t, ezzel kivéve azt a mezőröl.
    * A hole állapotát csukottra állítja.
    * @param t az a thing amit ki kell venni a mezőröl
    */
    public void Remove(Thing t){
        System.out.println("Switch.Remove()");
        movable=null;
        hole.SetOpen(false);
    }
    
}
