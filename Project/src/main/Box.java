package main;

public class Box extends Thing{
	

	
	 /**
	 * A Box meghal, vagyis eltûnik a pályáról. Meghívja a field Remove függvényét, anélkül hogy elõször áthelyezné magát
	 *  másvhova. Ezzel kikerül a játékból. Csökkenti az aktív dobozok számát, és ellenőrizteti, hogy vége van-e a játéknak.
	 */
   public void Die(){
   	System.out.println("Box.Die()");
   	field.Remove(this);
   	game.DecActiveBoxes();
	game.CheckEndGame();
   	System.out.println("Box.Die() returns");
   	return;

   }
   /**
	 * A Boxot tolják egy irányba. 
	 * Ha a Boxot közvetve tolják akkor meghívja a következő Field Accept-jét. Ha az true-val tér vissza akkor kiveszi magát az eddigi Field-ről
	 * a Remove-val és visszatér true-val, ha false-al akkor visszatér false-al.
	 * @param p az a Player aki ezt a Boxot eredetileg tolja közvetve, vagy közvetlen
	 * @param t az a Thing ami ezt a Boxot közvetlen tolja (lehet ugyanaz mint a p)
	 * @param d az a irány amerre a játékost tolják
	 * @return sikerült-e a Player-nek elmennie a fieldről
	 */
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
			System.out.println("Player.Pushedby(p,t,d) returns");
			return true;
		}
   }
}
