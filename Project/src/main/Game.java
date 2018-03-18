package main;

import java.util.ArrayList;

public class Game {

    private Board board;

    private ArrayList<Player> players;

    private int ActiveBoxes; //TODO: ez itt int? class diáról nem derül ki

    public void StartGame(){
        System.out.println("Game.StartGame()");
        board.SetUp();
    }

    public void EndGame(){
        System.out.println("Game.EndGame()");
        for (Player p:players){
            p.GetPoints();
        }
    }

    public boolean CheckEndGame(){
        System.out.println("Game.CheckEndGame()");
        if (ActiveBoxes==0){
            System.out.println("Game.CheckEndGame() returns");
            return true;
        }
        else{
            System.out.println("Game.CheckEndGame() returns");
            return false;
        }
    }

    public void DecActiveBoxes(){
        System.out.println("Game.DecActiveBoxes()");
        //ActiveBoxes--;
    } 
}
