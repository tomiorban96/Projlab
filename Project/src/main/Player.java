package main;

public class Player extends Thing{
	/**
	 * A játékos pontjai.
	 */
    private int points;
    /**
	 * A Player a játékos inputjára mozog. Ha nem létező (null) Field-re mozogna akkor visszatér anélkül hogy bármi történne.
	 * Ha nem null a Field akkor meghívja az Accept függvényét. Ha az true-val tér vissza akkor meghívja az eddigi Field-nek
	 * a Remove függvényét, így teljesen átkerül a következő Field-re.
	 *  Ha az Accept visszatérése false akkor nem hívja meg a Remove-ot.
	 *  @param d az az irány amerre mozog
	 */
    public void Move(Direction d){
    	System.out.println("Player.Move(d)");
        Field neighbor=field.GetNeighbor(d);
        Field currentField=field;
        if (neighbor == null) {
        	System.out.println("Player.Moved() returns");
        	return;
        }
        else {
        	if(neighbor.Accept(this,this, d)) {
        		currentField.Remove(this);
        		System.out.println("Player.Move(d) returns");
            	return;
        	}
        	else {
        		System.out.println("Player.Move(d) returns");
        		return;
        	}
        	
        }
        
    }
    /**
	 * A Player meghal, vagyis eltűnik a pályáról. Meghívja a field Remove függvényét, anélkül hogy először áthelyezné magát
	 *  másvhova. Ezzel kikerül a játékból.
	 */
    public void Die(){
    	System.out.println("Player.Die()");
    	field.Remove(this);
    	System.out.println("Player.Die() returns");
    }
    /**
	 * A Playert tolják egy irányba. Ha a Playert közvetlen tolja egy másik Player (vagyis a p és t megegyezik) akkor false-szal tér vissza.
	 * Ha a Playert közvetve tolják akkor meghívja a következő Field Accept-jét. Ha az true-val tér vissza akkor kiveszi magát az eddigi Field-ről
	 * a Remove-val és visszatér true-val, ha false-szal akkor meghívja a Die függvényét, meghal és visszatér true-val.
	 * @param p az a Player aki ezt a Playert eredetileg tolja közvetve, vagy közvetlen
	 * @param t az a Thing ami ezt a játékost közvetlen tolja (lehet ugyanaz mint a p)
	 * @param d az a irány amerre a játékost tolják
	 * @return sikerült-e a Player-nek elmennie a fieldről
	 */
    public boolean PushedBy(Player p, Thing t, Direction d){
    	System.out.println("Player.Pushedby(p,t,d)");
    	if(p==(Player)t) {
    		System.out.println("Player.Pushedby(p,t,d) returns");
    		return false;
    	}
    	else {
    		Field currentField=field;
    		Field neighbor=field.GetNeighbor(d);
    		if(neighbor.Accept(this,p,d)) {
    			currentField.Remove(this);
    			System.out.println("Player.Pushedby(p,t,d) returns");
    			return true;
    		}
    		else {
    			Die();
    			System.out.println("Player.Pushedby(p,t,d) returns");
    			return true;
    		}
    		
    	}
    }
    /**
	 * Visszaadja a játékos pontszámát.
	 * @return a points értéke
	 */
    public int GetPoints(){
    	System.out.println("Player.GetPoint()");
    	System.out.println("Player.GetPoint() returns");
    	return points;
        
    }
    /**
	 * Megnöveli a játékos pontszámát eggyel (1).
	 */
    public void AddPoint(){
    	System.out.println("Player.AddPoint()");
    	System.out.println("Player.Addpoint() returns");
        points++;
    } 
}
