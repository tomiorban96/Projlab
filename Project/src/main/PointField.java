package main;

public class PointField extends Field {
	/**
	 * Megmondja hogy van-e már doboz a mezőn
	 */
    private boolean completed;
    /**
	 * A játék aminek része a mező
	 */
    private Game game;
    /**
	* Ha a movable null, felveszi a p:Player játékost a movable tagváltozónak. Ekkor true-t ad vissza.
    * Ha a movable nem null akkor először meghívja a movable pushedBy(pusher,p,d) függvényét. Ha az true-val tér vissza
    * akkor elhelyezi a p-t a movable tagváltozóban. Ha false-al tér vissza akkor nem helyezi el p-t és false-al tér vissza.
    * Ha a completed true akkor mindig false-al tér vissza
    * @param p az a Player aki közvetlen rá akar lépni a mezőre
    * @param pusher az a Player aki eredetileg tolta a p-t
    * @param d az az irány amerre tolódnia kell a movable-nek ha az nem null
    * @return sikerült-e elhelyezni a p-t a mezőn
	 */
    public boolean Accept(Player p, Player pusher, Direction d){
        System.out.println("PointField.Accept()");
        
        if (movable!=null){                                                      //ha van rajta valami
            if (completed){                                                      //ha láda van rajta
                System.out.println("PointField.Accept() returns false");    
                return false;
            }
            else{
                if (movable.PushedBy(pusher,p,d)){                               //ha azt el lehet tolni
                	
                    System.out.println("PointField.Accept() returns true");
                    return true;
                }
                else{
                    System.out.println("PointField.Accept() returns false");    //ha nem
                    
                    return false;
                }
            }
        }
        else{
            System.out.println("PointField.Accept() returns true");             //ha nincs rajta semmi
            
            return true;
        }
    }
    /**
     * Ha a moveable null, felveszi a b:Boxot a movable tagváltozónak, a completed-et true-ra állítja és ad egy pontot a pusher Player-nek. Ekkor true-t ad vissza.
     * Ha a movable nem null akkor először meghívja a movable pushedBy(pusher,b,d) függvényét. Ha az true-val tér vissza
     * akkor elhelyezi a b-t a movable tagváltozóban, a completed-et true-ra állítja és ad egy pontot a pusher Player-nek. A
     * 
     *  Ha false-al tér vissza akkor nem helyezi el b-t és false-al tér vissza.
     * Ha a completed true akkor mindig false-al tér vissza
     * @param b az a Box aki közvetlen rá akar lépni a mezőre
     * @param pusher az a Player aki eredetileg tolta a b-t
     * @param d az az irány amerre tolódnia kell a movable-nek ha az nem null
     * @return sikerült-e elhelyezni a b-t a mezőn
     */
    public boolean Accept(Box b, Player pusher, Direction d){
        System.out.println("PointField.Accept()");
        if (movable!=null){                                                      //ha van rajta valami
            if (completed){                                                      //ha láda van rajta
                System.out.println("PointField.Accept() returns false");    
                return false;
            }
            else{
                if (movable.PushedBy(pusher,b,d)){                               //ha azt el lehet tolni
                	
                    completed=true;
                    pusher.AddPoint();											//toló játékos pontot kap
                    game.DecActiveBoxes();										//aktív ládák számának csökkentése
                    if (game.CheckEndGame()) {									//játék vége?
                    	game.EndGame();
                    }
                    System.out.println("PointField.Accept() returns true");
                    return true;
                }
                else{
                    System.out.println("PointField.Accept() returns false");    //ha nem lehet tolni
                    return false;
                }
            }
        }
        else{
            pusher.AddPoint();
            completed=true;
            game.DecActiveBoxes();
            if (game.CheckEndGame()) {											//játék vége?
            	game.EndGame();
            }
            System.out.println("PointField.Accept() returns true");             //ha nincs rajta semmi
            
            return true;
        }
    }
    /**
	 * @param completed the completed to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}
}
