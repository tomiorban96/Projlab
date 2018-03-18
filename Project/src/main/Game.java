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
     * Akkor van vége ha nincsenek aktív Boxok, vagy élő játékosok
     */
    public boolean CheckEndGame(){
        System.out.println("Game.CheckEndGame()");
        if (ActiveBoxes==0|LastPlayer()){
            System.out.println("Game.CheckEndGame() returns");
            return true;
        }
        else{
            System.out.println("Game.CheckEndGame() returns");
            return false;
        }
    }
    /**
     * Csökkenti az aktív Boxok számát eggyel
     */
    public void DecActiveBoxes(){
        System.out.println("Game.DecActiveBoxes()");
        //ActiveBoxes--;
    }
    private boolean LastPlayer() {
    	int n=0;
    	for (Player p:players) {
    		if (p.GetAlive())
    			n++;
    	}
    	if (n<=1)
    		return true;
    	else
    		return false;
    }
}
