package main;

public class Box extends Thing{

	
	 /**
		 * A Box meghal, vagyis eltûnik a pályáról. Meghívja a field Remove függvényét, anélkül hogy elõször áthelyezné magát
		 *  másvhova. Ezzel kikerül a játékból.
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
