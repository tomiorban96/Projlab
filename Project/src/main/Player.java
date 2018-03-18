package main;

public class Player extends Thing{
	/**
	 * A j�t�kos pontjai.
	 */
    private int points;
    /**
	 * A Player a j�t�kos inputj�ra mozog. Ha nem l�tez� (null) Field-re mozogna akkor visszat�r an�lk�l hogy b�rmi t�rt�nne.
	 * Ha nem null a Field akkor megh�vja az Accept f�ggv�ny�t. Ha az true-val t�r vissza akkor megh�vja az eddigi Field-nek
	 * a Remove f�ggv�ny�t, �gy teljesen �tker�l a k�vetkez� Field-re.
	 *  Ha az Accept visszat�r�se false akkor nem h�vja meg a Remove-ot.
	 *  @param d az az ir�ny amerre mozog
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
	 * A Player meghal, vagyis elt�nik a p�ly�r�l. Megh�vja a field Remove f�ggv�ny�t, an�lk�l hogy el�sz�r �thelyezn� mag�t
	 *  m�svhova. Ezzel kiker�l a j�t�kb�l.
	 */
    public void Die(){
    	System.out.println("Player.Die()");
    	field.Remove(this);
    	System.out.println("Player.Die() returns");
    }
    /**
	 * A Playert tolj�k egy ir�nyba. Ha a Playert k�zvetlen tolja egy m�sik Player (vagyis a p �s t megegyezik) akkor false-szal t�r vissza.
	 * Ha a Playert k�zvetve tolj�k akkor megh�vja a k�vetkez� Field Accept-j�t. Ha az true-val t�r vissza akkor kiveszi mag�t az eddigi Field-r�l
	 * a Remove-val �s visszat�r true-val, ha false-szal akkor megh�vja a Die f�ggv�ny�t, meghal �s visszat�r true-val.
	 * @param p az a Player aki ezt a Playert eredetileg tolja k�zvetve, vagy k�zvetlen
	 * @param t az a Thing ami ezt a j�t�kost k�zvetlen tolja (lehet ugyanaz mint a p)
	 * @param d az a ir�ny amerre a j�t�kost tolj�k
	 * @return siker�lt-e a Player-nek elmennie a fieldr�l
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
	 * Visszaadja a j�t�kos pontsz�m�t.
	 * @return a points �rt�ke
	 */
    public int GetPoints(){
    	System.out.println("Player.GetPoint()");
    	System.out.println("Player.GetPoint() returns");
    	return points;
        
    }
    /**
	 * Megn�veli a j�t�kos pontsz�m�t eggyel (1).
	 */
    public void AddPoint(){
    	System.out.println("Player.AddPoint()");
    	System.out.println("Player.Addpoint() returns");
        points++;
    }
}
