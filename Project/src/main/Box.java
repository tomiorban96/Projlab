package main;

public class Box extends Thing{

	
	 /**
		 * A Box meghal, vagyis elt�nik a p�ly�r�l. Megh�vja a field Remove f�ggv�ny�t, an�lk�l hogy el�sz�r �thelyezn� mag�t
		 *  m�svhova. Ezzel kiker�l a j�t�kb�l.
		 */
    public void Die(){
    	System.out.println("Box.Die()");
    	field.Remove(this);
    	
    	System.out.println("Box.Die() returns");
    	return;

    }

    public boolean PushedBy(Player p, Thing t, Direction d){
    	System.out.println("Box.Pushedby(p,t,d)");
    	Field currentField=field;
		Field neighbor=field.GetNeighbor(d);
		if(neighbor.Accept(this,p, d)) {
			currentField.Remove(this);
			System.out.println("Player.Pushedby(,p,t,d) returns");
			return true;
		}
		else {
			Die();
			System.out.println("Player.Pushedby(p,t,d) returns");
			return true;
		}
    }
}
