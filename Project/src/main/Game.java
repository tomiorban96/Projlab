package main;

import java.util.ArrayList;

public class Game {
	/**
     * a pálya amin a játék folyik
     */
    private Board board;
    /**
     * a játékosok listája akik játékban vannak
     */
    private ArrayList<Player> players;
    /**
     * a játékban lévő aktív Box-ok száma,
     * egy Box aktív ha nincs PointField-en és lehet tolni
     */
    private int ActiveBoxes; 
    /**
     * Elindítja a játékot.
     */
    public void StartGame(){
        System.out.println("Game.StartGame()");
        board.SetUp();
    }
    /**
     * A játék vége.
     * Összehasolítja a játékosok pontjait és eldönti ki nyert.
     */
    public void EndGame(){
        System.out.println("Game.EndGame()");
        for (Player p:players){
            p.GetPoints();
        }
    }
    /**
     * Megnézi vége van-e a játéknak.
     * Akkor van vége ha nincsenek aktív Boxok, vagy élő játékosok.
     */
    public boolean CheckEndGame(){
        System.out.println("Game.CheckEndGame()");
        if (ActiveBoxes==0||LastPlayer()){
            System.out.println("Game.CheckEndGame() returns true");
            return true;
        }
        else{
            System.out.println("Game.CheckEndGame() returns false");
            return false;
        }
    }
    /**
     * Csökkenti az aktív Boxok számát eggyel
     */
    public void DecActiveBoxes(){
        System.out.println("Game.DecActiveBoxes()");
        ActiveBoxes--;
    }
    /**
     * Megnézi, hogy van-e még élő játékos.
     */
    private boolean LastPlayer() {
    	int n=0;
    	for (Player p:players) {
    		if (p.getAlive())
    			n++;
    	}
    	if (n<1)
    		return true;
    	else
    		return false;
    }
    /**
	 * @param board the board to set
	 */
	public void setBoard(Board board) {
		this.board = board;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	/**
	 * @param activeBoxes the activeBoxes to set
	 */
	public void setActiveBoxes(int activeBoxes) {
		ActiveBoxes = activeBoxes;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
}
