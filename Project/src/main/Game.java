package main;

import java.util.ArrayList;

public class Game {

    private Board board;

    private ArrayList<Player> players;

    private int ActiveBoxes; //TODO: ez itt int? class diáról nem derül ki

    public void StartGame(){

    }

    public void EndGame(){

    }

    public boolean CheckEndGame(){
        return false;
    }

    public void DecActiveBoxes(){
        ActiveBoxes--;
    }
}
