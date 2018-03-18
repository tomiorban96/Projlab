package main;

public class Hole extends Field {
	/**
     * A Hole állapota
     */
    private boolean open;
    /**
    * Ha a movable null, felveszi a p:Player játékost a movable tagváltozónak, és meghívja a die függvényét. Ekkor true-t ad vissza.
    * Ha a movable nem null akkor először meghívja a movable pushedBy(pusher,p,d) függvényét. Ha az true-val tér vissza
    * akkor elhelyezi a p-t a movable tagváltozóban. 
    * Ekkor ha az open az true akkor meghívja a p die() függvényét. Ha false akkor nem. Mindkét esetben visszatér true-val
    * Ha a PushedBy false-al tér vissza akkor nem helyezi el p-t és false-al tér vissza.
    * @param p az a Player aki közvetlen rá akar lépni a mezőre
    * @param pusher az a Player aki eredetileg tolta a p-t
    * @param d az az irány amerre tolódnia kell a movable-nek ha az nem null
    * @return sikerült-e elhelyezni a p-t a mezőn
     */
    public boolean Accept(Player p, Player pusher, Direction d){
        System.out.println("Hole.Accept()");
         if (movable!=null){                                     //van rajta valami
            if (movable.PushedBy(pusher,p,d)){                  //ha el lehet tolni
                if (open){                                      // ha a lyuk nyitva van
                    p.Die();
                }
                System.out.println("Hole.Accept() returns true");
                return true;
            }
            else{                                               //ha nem lehet eltolni
                System.out.println("Hole.Accept() returns false");
                return false;
            }     
        }
        else{                                                   //nincs rajta semmi
            if (open){                                          // ha a lyuk nyitva van
                p.Die();
            }
            System.out.println("Hole.Accept() returns true");
            return true;
        }
    }
    /**
     * Ha a movable null, felveszi a b:Box játékost a movable tagváltozónak, és meghívja a die függvényét. Ekkor true-t ad vissza.
     * Ha a movable nem null akkor először meghívja a movable pushedBy(pusher,b,d) függvényét. Ha az true-val tér vissza
     * akkor elhelyezi a b-t a movable tagváltozóban. 
     * Ekkor ha az open az true akkor meghívja a b die() függvényét. Ha false akkor nem. Mindkét esetben visszatér true-val
     * Ha a PushedBy false-al tér vissza akkor nem helyezi el b-t és false-al tér vissza.
     * @param b az a Box aki közvetlen rá akar lépni a mezőre
     * @param pusher az a Box aki eredetileg tolta a p-t
     * @param d az az irány amerre tolódnia kell a movable-nek ha az nem null
     * @return sikerült-e elhelyezni a b-t a mezőn
      */
    public boolean Accept(Box b, Player pusher,Direction d){        //doboz mozog rá
        System.out.println("Hole.Accept()");                                                     
        if (movable!=null){                                     //van rajta valami
            if (movable.PushedBy(pusher,b,d)){                  //ha el lehet tolni
                if (open){                                      // ha a lyuk nyitva van
                    b.Die();
                }
                System.out.println("Hole.Accept() returns true");
                return true;
            }
            else{                                               //ha nem lehet eltolni
                System.out.println("Hole.Accept() returns false");
                return false;
            }     
        }
        else{                                                   //nincs rajta semmi
            if (open){                                          // ha a lyuk nyitva van
                b.Die();
            }
            System.out.println("Hole.Accept() returns true");
            return true;
        }
    }
    /**
     * Megadja hogy a Hole nyitva vagy csukva van
     * @return az open értéke
     */
    public boolean GetOpen(){
        System.out.println("Hole.GetOpen()");
        System.out.println("Hole.GetOpen() returns");
        return open;
    }
    /**
     * Beállítja a Hole állapotát
     * @param b a kívánt érték
     */
    public void SetOpen(boolean b){
        System.out.println("Hole.SetOpen()");
        open = b;
    } 
}
