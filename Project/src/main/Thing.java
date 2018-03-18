package main;

public abstract class Thing {
	/**
    * Az a mező amin a Thing van
    */
    protected Field field;
    /**
     * A játék amiben a thing részt vesz
     */
    protected Game game;
    /**
     * Absztrakt függvény amit a leszármazottak valósítanak meg
     */
    abstract void Die(); 
    /**
     * Absztrakt függvény amit a leszármazottak valósítanak meg
     * @param p játékos aki tol
     * @param t Thing ami közvetlen tol (t==p lehet)
     * @param d a tolás iránya
     * @return sikerült-e a tolás
     */
    public boolean PushedBy(Player p, Thing t, Direction d){
        System.out.println("Thing.PushedBy()");
        System.out.println("Thing.PushedBy() returns false");
        return false; 
    }
}
