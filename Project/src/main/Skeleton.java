package main;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Szkeleton {
    public static void main(String args[]){
        PrintMenu();
    }
    
    private static void PrintMenu(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("1. Játék indítása\n2. Játékos mozog...\n3. Játékos tol...\n4. Játékos hozzáadása\n5. Kilépés\n$ ");
            switch (sc.nextInt()){
                case 1: //1 Játék indítása
                    System.out.println("Játék indítása");
                    NewGameStarts();
                    break;
                case 2: //2 Játékos mozog
                    System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                    switch (sc.nextInt()){
                        case 1: //2.1 Játékos mozog üres mezőre
                            Jatekosuresre();
                            break;
                        case 2: //2.2 Játékos mozog falnak
                            Jatekosfalnak();
                            break;
                        case 3: //2.3 Játékos mozog lyukra
                            System.out.println("Lyuk nyitva van? (Y/N)");
                            boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                            System.out.println("Utolsó aktív játékos? (Y/N)");
                            boolean lastActivePlayer = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                            PlayerMovesOntoHole(isOpen,lastActivePlayer);
                            break;
                        case 4: //2.4 Játékos mozog kapcsolóra
                            System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                            switch (sc.nextInt()){
                                case 1: //2.4.1 ami üres
                                    printSubMenu();
                                    switch (sc.nextInt()){
                                        case 1: //2.4.1.1 és a hozzá tartozó lyukon nincs semmi
                                        	PlayerOntoEmptySwitch();
                                            break;
                                        case 2: //2.4.1.2 és a hozzá tartozó lyukon láda áll
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoEmptySwitchKillBox(lastActiveBox);
                                            break;
                                        case 3: //2.4.1.3 és a hozzá tartozó lyukon játékos áll
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoEmptySwitchKillPlayer(lastActivePlayer2);
                                            break;
                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;
                                case 2: //2.4.2 amin láda áll
                                    printSubMenu();
                                    switch (sc.nextInt()){
                                        case 1: //2.4.2.1 és a hozzá tartozó lyukon nincs semmi
                                        	PlayerOntoSwitchWithBox();
                                            break;
                                        case 2: //2.4.2.2 és a hozzá tartozó lyukon láda áll
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoSwitchWithBoxKillBox(lastActiveBox);
                                            break;
                                        case 3: //2.4.2.3 és a hozzá tartozó lyukon játékos áll
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoSwitchWithBoxKillPlayer();
                                            break;
                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;
                                case 3: //2.4.3 amin játékos áll
                                    printSubMenu();
                                    switch (sc.nextInt()){
                                        case 1: //2.4.3.1 és a hozzá tartozó lyukon nincs semmi
                                        	PlayerOntoSwitchWithPlayer();
                                            break;
                                        case 2: //2.4.3.2 és a hozzá tartozó lyukon láda áll
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoSwitchWithPlayerKillBox();
                                            break;
                                        case 3: //2.4.3.3 hozzá tartozó lyukon játékos áll
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoSwitchWithPlayerKillPlayer();
                                            break;
                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;
                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
                            break;
                        case 5: //2.5 Játékos mozog pontszerző mezőre
                            System.out.println("Mező teljesítve? (Y/N)");
                            boolean fieldCompleted = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                            Jatekospontszerzore(fieldCompleted);
                            break;
                        default:
                            System.out.println("Nem létező menüpont!");
                    }
                    break;
                case 3: //3. Játékos tol
                    System.out.print("1. ...ládát...\n2. ...játékost...\n3. ...több ládából álló sort...\n4. ...ládákból és játékosokból vegyesen álló sort...\n$ ");
                    switch (sc.nextInt()){
                        case 1: //3.1 Játékos tol ládát
                            System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                            switch (sc.nextInt()){
                                case 1: //3.1.1 üres mezőre
                                    JatekosLadatUresre();
                                    break;
                                case 2: //3.1.2 falnak
                                    JatekosLadatFalnak();
                                    break;
                                case 3: //3.1.3 lyukra
                                    System.out.println("Lyuk nyitva van? (Y/N)");
                                    boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    System.out.println("Utolsó láda? (Y/N)");
                                    boolean lastActivePlayer = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    JatekosLadatLyukra(isOpen, lastActivePlayer);
                                    break;
                                case 4: //3.1.4 kapcsolóra
                                    System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.1.4.1 ami üres
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.1.4.1. és a hozzá tartozó lyukon nincs semmi
                                                	JatekosLadatUresKapcsolora();
                                                    break;
                                                case 2: //3.1.4.1.2 és a hozzá tartozó lyukon láda áll
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    JatekosLadatUresKapcsoloraLadaEsik(lastActiveBox);
                                                    break;
                                                case 3: //3.1.4.1.3 és a hozzá tartozó lyukon játékos áll
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    JatekosLadatUresKapcsoloraJatekosEsik(lastActivePlayer2);
                                                    break;
                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;
                                        case 2: //3.1.4.2 amin láda áll
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.1.4.2.1 és a hozzá tartozó lyukon nincs semmi
                                                	JatekosLadatLadasKapcsolora();
                                                    break;
                                                case 2: //3.1.4.2.2 és a hozzá tartozó lyukon láda áll
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    JatekosLadatLadasKapcsoloraLadaEsik(lastActiveBox);
                                                    break;
                                                case 3: //3.1.4.2.3 és a hozzá tartozó lyukon játékos áll
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    JatekosLadatLadasKapcsoloraJatekosEsik(lastActivePlayer2);
                                                    break;
                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;
                                        case 3: //3.1.4.3 amin játékos áll
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.1.4.3.1 és a hozzá tartozó lyukon nincs semmi
                                                	JatekosJatekostLadasKapcsolora();
                                                    break;
                                                case 2: //3.1.4.3.2 és a hozzá tartozó lyukon láda áll
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    JatekosJatekostLadasKapcsoloraLadaEsik(lastActiveBox);
                                                    break;

                                                case 3: //3.1.4.3.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    JatekosJatekostLadasKapcsoloraJatekosEsik(lastActivePlayer2);
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;
                                case 5: //3.1.5 Játékos tol ládát pontszerző mezőre
                                    System.out.println("Mező teljesítve? (Y/N)");
                                    boolean fieldCompleted = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    JatekosLadatPontszerzore(fieldCompleted);
                                    break;
                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
                            break;
                        case 2: //3.2 Játékos tol játékost
                        	PlayerPushPlayer();
                        	break;
                        case 3: //3.3 Játékos tol több ládából álló sort
                            System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                            switch (sc.nextInt()){
                                case 1: //3.3.1 üres mezőre
                                	PlayerPushesManyBoxes();
                                    break;

                                case 2: //3.3.2 falnak
                                	PlayerPushesManyBoxesIntoWall();
                                    break;

                                case 3: //3.3.3 lyukra
                                    System.out.println("Lyuk nyitva van? (Y/N)");
                                    boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    PlayerPushesManyBoxesIntoHole(isOpen);
                                    break;
                                case 4: //3.3.4 kapcsolóra
                                    System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.3.4.1 ami üres 
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.3.4.1.1 és a hozzá tartozó lyuk üres
                                                	PlayerPushesManyBoxesOntoSwitch();                                          	
                                                    break;
                                                case 2: //3.3.4.1.2 és a hozzá tartozó lyukon láda van
                                                	PlayerPushesManyBoxesOntoSwitchKillBox();
                                                    break;
                                                case 3: //3.3.4.1.3 és a hozzá tartozó lyukon játékos van
                                                	PlayerPushesManyBoxesOntoSwitchKillPlayer();
                                                    break;
                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;
                                        case 2: //3.3.4.2 amin láda van
                                        	PlayerPushesManyBoxesOntoSwitchWithBox();
                                            break;
                                        case 3: //3.3.4.3 amin játékos van
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.3.4.3.1  és a hozzá tartozó lyuk üres
                                                	PlayerPushesManyBoxesOntoSwitchWithPlayer(); 
                                                	break;

                                                case 2: //3.3.4.3.2 és a hozzá tartozó lyukon láda van
                                                    PlayerPushesManyBoxesOntoSwitchWithPlayerKillBox();                                                   
                                                    break;

                                                case 3: //3.3.4.3.3
                                                    
                                                	PlayerPushesManyBoxesOntoSwitchWithPlayerKillPlayer();                                                  
                                                	break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;

                                case 5: //3.3.5
                                    System.out.println("Mező teljesítve? (Y/N)");
                                    boolean fieldCompleted = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    PlayerPushesManyBoxesOntoPointField(fieldCompleted);
                                    

                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
                            break;

                        case 4: //3.4
                            System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                            switch (sc.nextInt()){
                                case 1: //3.4.1
                                	PlayerPushesManyThings();
                                    
                                    break;

                                case 2: //3.4.2
                                	PlayerPushesManyThingsIntoWall();
                                    break;

                                case 3: //3.4.3
                                    System.out.println("Lyuk nyitva van? (Y/N)");

                                    boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    PlayerPushesManyThingsIntoHole(isOpen);

                                    
                                    break;

                                case 4: //3.4.4
                                    System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.4.4.1
                                            PlayerPushesManyThingsOntoSwitch();

                                            break;

                                        case 2: //3.4.4.2
                                        	PlayerPushesManyThingsOntoSwitchWithBox();
                                            break;

                                        case 3: //3.4.4.3
                                            PlayerPushesManyThingsOntoSwitchWithPlayer();
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;

                                case 5: //3.4.5
                                    System.out.println("Mező teljesítve? (Y/N)");
                                    boolean fieldCompleted = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    PlayerPushesManyThingsOntoPointField(fieldCompleted);

                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
                            break;

                        default:
                            System.out.println("Nem létező menüpont!");
                    }

                    break;

                case 4: //4
                    System.out.println("Adja meg a játékos pontszámát!");
                    int score = sc.nextInt();
                    // Todo: Játékos hozzáadása score pontszámmal
                    break;

                case 5: //5
                    return;
                   

                default:
                    System.out.println("Nem létező menüpont!");

            }
        } catch (Exception e){
            e.printStackTrace();
        }

}

    private static void PlayerPushPlayer() {
    	Player p=new Player();
		Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Player p2=new Player();
		p2.setField(f2);
		f3.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash.put(Direction.Right, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	p.Move(d);					
	}

	private static void PlayerOntoSwitchWithPlayerKillPlayer() {
    	Player p=new Player();
		Field f=new Field();
		Field f2=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Player p3=new Player();
		Player p2=new Player();
		p2.setField(s);
		s.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		h.setMovable(p3);
		p3.setField(h);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);	
    	p.Move(d);					
	}

	private static void PlayerOntoSwitchWithPlayerKillBox() {
    	Player p=new Player();
		Field f=new Field();
		Field f2=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Box b=new Box();
		Player p2=new Player();
		p2.setField(s);
		s.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		h.setMovable(b);
		b.setField(h);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);	
    	p.Move(d);			
	}

	private static void PlayerOntoSwitchWithPlayer() {
    	Player p=new Player();
		Field f=new Field();
		Field f2=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Box b=new Box();
		Player p2=new Player();
		p2.setField(s);
		s.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);	
    	p.Move(d);	
	}

	private static void PlayerOntoSwitchWithBoxKillPlayer() {
    	Player p=new Player();
		Field f=new Field();
		Field f2=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Box b=new Box();
		Player p2=new Player();
		b.setField(s);
		s.setMovable(b);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		h.setMovable(p2);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);	
    	p.Move(d);	
	}

	private static void PlayerOntoSwitchWithBoxKillBox(boolean lastActiveBox) {
    	Player p=new Player();
		Field f=new Field();
		Field f2=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Box b=new Box();
		Box b2=new Box();
		b.setField(s);
		s.setMovable(b);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		h.setMovable(b2);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);
    	
    	
		p.Move(d);				
	}

	private static void PlayerOntoSwitchWithBox() {
    	Player p=new Player();
		Field f=new Field();
		Field f2=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Box b=new Box();
		b.setField(s);
		s.setMovable(b);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);
    	
    	
		p.Move(d);		
	}

	private static void PlayerOntoEmptySwitchKillPlayer(boolean lastActivePlayer2) {
    	Player p=new Player();
		Field f=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Player p2=new Player();
		p2.setField(h);
		h.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);
		p.Move(d);		
	}

	private static void PlayerOntoEmptySwitchKillBox(boolean lastActiveBox) {
    	Player p=new Player();
		Field f=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Box b=new Box();
		b.setField(h);
		h.setMovable(b);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);
		p.Move(d);
	}

	private static void PlayerOntoEmptySwitch() {
		// TODO Auto-generated method stub
		Player p=new Player();
		Field f=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		Direction d=Direction.Right;
		f.setMovable(p);
		p.setField(f);
		s.setHole(h);
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, s);
    	f.setNeighbors(hash2);
    	s.setNeighbors(hash);
		p.Move(d);
		}

	private static boolean getYesOrNo(char choice) throws Exception {

        if (choice == 'Y')
            return true;
        else if (choice == 'N')
            return false;
        else
            throw new Exception("Rossz bemeneti paraméter! (Y/N)");
    }

    private static void printSubMenu(){
        System.out.print("1. ...nincs semmi\n2. ...láda áll\n3. ...játékos áll\n$ ");
    }

    private static void JatekosLadatUresre(){
        Field f1 = new Field();
        Field f2 = new Field();
        Field f3 = new Field();
        Player p = new Player();
        Box b = new Box();
        Hashtable <Direction,Field> h1=new Hashtable<>();
        Hashtable <Direction,Field> h2=new Hashtable<>();
        h1.put(Direction.Down, f2);
        h2.put(Direction.Down, f3);
        f1.setNeighbors(h1);
        f2.setNeighbors(h2);
        p.setField(f1);
        b.setField(f2);
        f2.setMovable(b);
        p.Move(Direction.Down);
    }

    private static void JatekosLadatFalnak(){
        Field f1 = new Field();
        Field f2 = new Field();
        Wall w = new Wall();
        Player p = new Player();
        ArrayList<Player> players=new ArrayList<Player>();
        players.add(p);
        Box b = new Box();
        Game g = new Game();
        Hashtable <Direction,Field> h1=new Hashtable<>();
        Hashtable <Direction,Field> h2=new Hashtable<>();
        h1.put(Direction.Down, f2);
        h2.put(Direction.Down, w);
        f1.setNeighbors(h1);
        f2.setNeighbors(h2);
        p.setField(f1);
        b.setField(f2);
        b.setGame(g);
        f2.setMovable(b);
        f1.setMovable(p);
        g.setPlayers(players);
        p.Move(Direction.Down);
    }
     private static void Jatekosuresre(){
    	Player p=new Player();
    	Hashtable <Direction,Field> h=new Hashtable<Direction,Field>();
    	Field f1=new Field();
    	h.put(Direction.Down, f1);
    	Field f2=new Field();
    	f2.setMovable(p);
    	f2.setNeighbors(h);
    	p.setField(f2);
    	p.Move(Direction.Down);
    }
    private static void Jatekosfalnak(){
    	Player p=new Player();
    	Hashtable <Direction,Field> h=new Hashtable<Direction,Field>();
    	Wall w1=new Wall();
    	h.put(Direction.Down, w1);
    	Field f2=new Field();
    	f2.setMovable(p);
    	p.setField(f2);
    	f2.setNeighbors(h);
    	p.Move(Direction.Down);
    }
    
    private static void Jatekospontszerzore(boolean fieldCompleted) {
    	Player p=new Player();
    	Hashtable <Direction,Field> h=new Hashtable<Direction,Field>();
    	PointField pf=new PointField();
    	Box b=new Box();
    	
    	h.put(Direction.Down, pf);
    	if (fieldCompleted) {
    		pf.setCompleted(true);
    		pf.setMovable(b);
    	}
    	Field f2=new Field();
    	f2.setMovable(p);
    	f2.setNeighbors(h);
    	p.setField(f2);
    	p.Move(Direction.Down);
    	
    }
    private static void JatekosLadatLyukra(boolean isOpen, boolean lastActiveBox){
    	Game game=new Game();
    	 Field f1 = new Field();
         Field f2 = new Field();
         Hole h = new Hole();
         Player p = new Player();
         ArrayList<Player> players=new ArrayList<Player>();
         players.add(p);
         Box b = new Box();
         Hashtable <Direction,Field> h1=new Hashtable<>();
         Hashtable <Direction,Field> h2=new Hashtable<>();
         h1.put(Direction.Down, f2);
         h2.put(Direction.Down, h);
         f1.setNeighbors(h1);
         f2.setNeighbors(h2);
         p.setField(f1);
         b.setField(f2);
         f2.setMovable(b);
         f1.setMovable(p);
         h.SetOpen(false);
         if (isOpen) {
       	  h.SetOpen(true);
         }
         p.setAlive(true);
         game.setActiveBoxes(10);
         if (lastActiveBox) {
        	 game.setActiveBoxes(1);
         }
         b.setGame(game);
         game.setPlayers(players);
         p.Move(Direction.Down);
    }
    private static void JatekosLadatUresKapcsolora(){
    	 Field f1=new Field();
    	 Field f2=new Field();
    	 Switch s=new Switch();
    	 Hole h=new Hole();
    	 Hashtable <Direction,Field> h1=new Hashtable<>();
    	 Hashtable <Direction,Field> h2=new Hashtable<>();
    	 h1.put(Direction.Down, s);
    	 f2.setNeighbors(h1);
    	 h2.put(Direction.Down, f2);
    	 f1.setNeighbors(h2);
    	 Player p=new Player();
    	 p.setField(f1);
    	 f1.setMovable(p);
    	 Box b=new Box();
    	 b.setField(f2);
    	 f2.setMovable(b);
    	 s.setHole(h);
    	 
    	 p.Move(Direction.Down);
    }
    private static void JatekosLadatUresKapcsoloraLadaEsik(boolean lastActiveBox){
    	 Game game=new Game();
    	 ArrayList<Player> players=new ArrayList<Player>();
	   	 Field f1=new Field();
	   	 Field f2=new Field();
	   	 Switch s=new Switch();
	   	 Hole h=new Hole();
	   	 Hashtable <Direction,Field> h1=new Hashtable<>();
	   	 Hashtable <Direction,Field> h2=new Hashtable<>();
	   	 h1.put(Direction.Down, s);
	   	 f2.setNeighbors(h1);
	   	 h2.put(Direction.Down, f2);
	   	 f1.setNeighbors(h2);
	   	 Player p=new Player();
	   	 p.setField(f1);
	   	 f1.setMovable(p);
	   	 Box b=new Box();
	   	 b.setField(f2);
	   	 f2.setMovable(b);
	   	 Box b2=new Box();
	   	 b2.setField(h);
	   	 h.setMovable(b2);
	   	 s.setHole(h);
	   	 b2.setGame(game);
	   	 players.add(p);
	   	 game.setPlayers(players);
	   	 game.setActiveBoxes(10);
	   	 if (lastActiveBox) {
	   		 game.setActiveBoxes(1);
	   	 }
	   	 p.setAlive(true);
	   	 p.Move(Direction.Down);
    }
    private static void JatekosLadatUresKapcsoloraJatekosEsik(boolean lastActivePlayer2){
    	Game game=new Game();
   		ArrayList<Player> players=new ArrayList<Player>();
	   	Field f1=new Field();
	   	Field f2=new Field();
	   	Switch s=new Switch();
	   	Hole h=new Hole();
	   	Hashtable <Direction,Field> h1=new Hashtable<>();
	   	Hashtable <Direction,Field> h2=new Hashtable<>();
	   	h1.put(Direction.Down, s);
	   	f2.setNeighbors(h1);
	   	h2.put(Direction.Down, f2);
	   	f1.setNeighbors(h2);
	   	Player p=new Player();
	   	p.setField(f1);
	    f1.setMovable(p);
	   	Box b=new Box();
	   	b.setField(f2);
	   	f2.setMovable(b);
	   	Player p2=new Player();
	   	p2.setField(h);
	   	h.setMovable(p2);
	   	s.setHole(h);
	   	p2.setGame(game);
	   	players.add(p);
	   	game.setPlayers(players);
	   	game.setActiveBoxes(10);
	   	p.setAlive(true);
	   	if (lastActivePlayer2)
	   		p.setAlive(false);
	   	p.Move(Direction.Down);
   }
    private static void JatekosLadatLadasKapcsolora(){
   	 Field f1=new Field();
   	 Field f2=new Field();
   	 Field f3=new Field();
   	 Switch s=new Switch();
   	 Hole h=new Hole();
   	 Hashtable <Direction,Field> h1=new Hashtable<>();
   	 Hashtable <Direction,Field> h2=new Hashtable<>();
   	 h1.put(Direction.Down, s);
   	 f2.setNeighbors(h1);
   	 h2.put(Direction.Down, f2);
   	 f1.setNeighbors(h2);
   	 Player p=new Player();
   	 p.setField(f1);
   	 f1.setMovable(p);
   	 Box b=new Box();
   	 b.setField(f2);
   	 f2.setMovable(b);
   	 Box b2=new Box();
   	 
   	 s.setHole(h);
   	 
   	 p.Move(Direction.Down);
   }
    private static void JatekosLadatLadasKapcsoloraLadaEsik(boolean lastActiveBox){
    	Game game=new Game();
    	ArrayList<Player> players=new ArrayList<Player>();
    	
      	 Field f1=new Field();
      	 Field f2=new Field();
      	 Field f3=new Field();
      	 Switch s=new Switch();
      	 Hole h=new Hole();
      	 Hashtable <Direction,Field> h1=new Hashtable<>();
      	 Hashtable <Direction,Field> h2=new Hashtable<>();
      	 Hashtable <Direction,Field> h3=new Hashtable<>();
      	 h1.put(Direction.Down, s);
      	 f2.setNeighbors(h1);
      	 h2.put(Direction.Down, f2);
      	 f1.setNeighbors(h2);
      	 h3.put(Direction.Down, f3);
     	 s.setNeighbors(h3);
      	 Player p=new Player();
      	 p.setField(f1);
      	 f1.setMovable(p);
      	 Box b=new Box();
      	 b.setField(f2);
      	 f2.setMovable(b);
      	 Box b2=new Box();
      	 b2.setField(s);
      	 Box b3=new Box();
      	 b3.setField(h);
      	 h.setMovable(b3);
      	 s.setMovable(b2);
      	 s.setHole(h);
      	 p.setAlive(true);
      	 players.add(p);
      	 game.setActiveBoxes(10);
      	 if (lastActiveBox) {
      		game.setActiveBoxes(1);
      	 }
      	 game.setPlayers(players);
      	 b3.setGame(game);
      	 p.Move(Direction.Down);
      }
    private static void JatekosLadatLadasKapcsoloraJatekosEsik(boolean lastActivePlayer2){
    	Game game=new Game();
    	ArrayList<Player> players=new ArrayList<Player>();
      	 Field f1=new Field();
      	 Field f2=new Field();
      	 Field f3=new Field();
      	 Switch s=new Switch();
      	 Hole h=new Hole();
      	 Hashtable <Direction,Field> h1=new Hashtable<>();
      	 Hashtable <Direction,Field> h2=new Hashtable<>();
      	 Hashtable <Direction,Field> h3=new Hashtable<>();
      	 h1.put(Direction.Down, s);
      	 f2.setNeighbors(h1);
      	 h2.put(Direction.Down, f2);
      	 f1.setNeighbors(h2);
      	 h3.put(Direction.Down, f3);
     	 s.setNeighbors(h3);
      	 Player p=new Player();
      	 p.setField(f1);
      	 f1.setMovable(p);
      	Player p2=new Player();
     	 p2.setField(h);
     	 h.setMovable(p2);
      	 Box b=new Box();
      	 b.setField(f2);
      	 f2.setMovable(b);
      	 Box b2=new Box();
      	 b2.setField(s);
      	 s.setMovable(b2);
      	 s.setHole(h);
      	 p.setAlive(true);
      	 players.add(p);
      	 players.add(p2);
      	 game.setActiveBoxes(10);
      	 
      	 if (lastActivePlayer2) {
      		p.setAlive(false);
      	 }
      	 game.setPlayers(players);
      	 p2.setGame(game);
      	 p.Move(Direction.Down);
      }
    private static void JatekosJatekostLadasKapcsolora(){
      	 Field f1=new Field();
      	 Field f2=new Field();
      	 Field f3=new Field();
      	 Switch s=new Switch();
      	 Hole h=new Hole();
      	 Hashtable <Direction,Field> h1=new Hashtable<>();
      	 Hashtable <Direction,Field> h2=new Hashtable<>();
      	 h1.put(Direction.Down, s);
      	 f2.setNeighbors(h1);
      	 h2.put(Direction.Down, f2);
      	 f1.setNeighbors(h2);
      	 Player p=new Player();
      	 p.setField(f1);
      	 f1.setMovable(p);
      	 Player p2=new Player();
      	 p2.setField(f2);
      	 f2.setMovable(p2);
      	 Box b2=new Box();
      	 s.setHole(h);
      	 p.Move(Direction.Down);
      }
    private static void JatekosJatekostLadasKapcsoloraLadaEsik(boolean lastActiveBox){
    	Game game=new Game();
    	ArrayList<Player> players=new ArrayList<Player>();
      	 Field f1=new Field();
      	 Field f2=new Field();
      	 Field f3=new Field();
      	 Switch s=new Switch();
      	 Hole h=new Hole();
      	 Hashtable <Direction,Field> h1=new Hashtable<>();
      	 Hashtable <Direction,Field> h2=new Hashtable<>();
      	 Hashtable <Direction,Field> h3=new Hashtable<>();
      	 h1.put(Direction.Down, s);
      	 f2.setNeighbors(h1);
      	 h2.put(Direction.Down, f2);
      	 f1.setNeighbors(h2);
      	 h3.put(Direction.Down, f3);
     	 s.setNeighbors(h3);
      	 Player p=new Player();
      	 p.setField(f1);
      	 f1.setMovable(p);
      	 Player p2=new Player();
      	 p2.setField(f2);
      	 f2.setMovable(p2);
      	 Box b=new Box();
      	 b.setField(s);
      	 s.setMovable(b);
      	 Box b2=new Box();
      	 b2.setField(h);
      	 h.setMovable(b2);
      	 s.setHole(h);
      	 p.setAlive(true);
      	 players.add(p);
      	 game.setActiveBoxes(10);
      	 if (lastActiveBox) {
      		game.setActiveBoxes(1);
      	 }
      	 game.setPlayers(players);
      	 b2.setGame(game);
      	 p.Move(Direction.Down);
      }
    private static void JatekosJatekostLadasKapcsoloraJatekosEsik(boolean lastActivePlayer2){
    	Game game=new Game();
    	ArrayList<Player> players=new ArrayList<Player>();
      	 Field f1=new Field();
      	 Field f2=new Field();
      	 Field f3=new Field();
      	 Switch s=new Switch();
      	 Hole h=new Hole();
      	 Hashtable <Direction,Field> h1=new Hashtable<>();
      	 Hashtable <Direction,Field> h2=new Hashtable<>();
      	 Hashtable <Direction,Field> h3=new Hashtable<>();
      	 h1.put(Direction.Down, s);
      	 f2.setNeighbors(h1);
      	 h2.put(Direction.Down, f2);
      	 f1.setNeighbors(h2);
      	 h3.put(Direction.Down, f3);
     	 s.setNeighbors(h3);
      	 Player p=new Player();
      	 p.setField(f1);
      	 f1.setMovable(p);
      	 Player p2=new Player();
     	 p2.setField(f2);
     	 f2.setMovable(p2);
      	 Player p3=new Player();
      	 p3.setField(h);
      	 h.setMovable(p3);
      	 Box b2=new Box();
      	 b2.setField(s);
      	 s.setMovable(b2);
      	 s.setHole(h);
      	 p.setAlive(true);
      	 players.add(p);
      	 players.add(p3);
      	 game.setActiveBoxes(10);
      	 
      	 if (lastActivePlayer2) {
      		p.setAlive(false);
      	 }
      	 game.setPlayers(players);
      	 p3.setGame(game);
      	 p.Move(Direction.Down);
      }
    private static void JatekosLadatPontszerzore(boolean completed) {
    	Game game=new Game();
    	ArrayList<Player> players=new ArrayList<Player>();
    	Field f1=new Field();
    	Field f2=new Field();
    	PointField pf=new PointField();
    	pf.setGame(game);
    	
    	Hashtable <Direction,Field> h1=new Hashtable<>();
     	Hashtable <Direction,Field> h2=new Hashtable<>();
     	h1.put(Direction.Down, pf);
     	h2.put(Direction.Down, f2);
     	f1.setNeighbors(h2);
     	f2.setNeighbors(h1);
    	
    	Player p=new Player();
    	p.setField(f1);
    	f1.setMovable(p);
    	p.setGame(game);
    	
    	Box b=new Box();
    	b.setField(f2);
    	f2.setMovable(b);
    	
    	Box b2=new Box();
    	
    	players.add(p);
    	game.setPlayers(players);
    	game.setActiveBoxes(10);
    	p.setAlive(true);
    	pf.setCompleted(false);
    	if (completed) {
    		pf.setCompleted(true);
    		b2.setField(pf);
    		pf.setMovable(b2);
    	}
    	p.Move(Direction.Down);
    	
    }
    private static void PlayerMovesOntoHole(boolean isOpen, boolean lastActivePlayer) {
    	Game g=new Game();
    	ArrayList<Player> players=new ArrayList<Player>();
    	Field f=new Field();
    	Hole h=new Hole();
    	h.SetOpen(isOpen);
    	 Hashtable <Direction,Field> h1=new Hashtable<>();
    	 h1.put(Direction.Down, h);
    	 f.setNeighbors(h1);
    	Player p=new Player();
    	p.setGame(g);
		p.setField(f);
		p.setAlive(true);
		
		Player p2=new Player();
		p2.setAlive(true);
		p2.setGame(g);
		f.setMovable(p);
		players.add(p);
		players.add(p2);
		if (lastActivePlayer) {
			p2.setAlive(false);
		}
		g.setActiveBoxes(10);
		g.setPlayers(players);
		p.Move(Direction.Down);
}
    private static void PlayerPushesManyBoxes() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, f4);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	f4.setNeighbors(hash4);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	p.Move(d);
	}
    private static void PlayerPushesManyBoxesIntoWall() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Wall w=new Wall();
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, w);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	w.setNeighbors(hash4);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	p.Move(d);		
}
    private static void PlayerPushesManyBoxesIntoHole(boolean isOpen) {
    	Game game=new Game();
    	ArrayList<Player> players=new ArrayList<Player>();
    	Player p=new Player();
    	p.setAlive(true);
    	players.add(p);
    	p.setGame(game);
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Hole h=new Hole();
		h.SetOpen(isOpen);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, h);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	h.setNeighbors(hash4);
    	Box b1=new Box();
    	Box b2=new Box();
    	b1.setGame(game);
    	b2.setGame(game);
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	game.setPlayers(players);
    	
    	p.Move(d);				
}
    private static void PlayerPushesManyBoxesOntoSwitch() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Box b3=new Box();
		h.SetOpen(false);
		
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	p.Move(d);					
}
    private static void PlayerPushesManyThingsOntoPointField(boolean fieldCompleted) {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		PointField pf=new PointField();
		pf.setCompleted(fieldCompleted);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, pf);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	pf.setNeighbors(hash4);
    	Box b1=new Box();
    	Player p4=new Player();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(p4);
    	p4.setField(f2);
    	p.Move(d);
		
	}

	private static void PlayerPushesManyThingsOntoSwitchWithBox() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Box b4=new Box();
		h.SetOpen(false);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	hash4.put(Direction.Right, f4);
    	Hashtable <Direction,Field> hash5=new Hashtable<Direction,Field>();
    	hash5.put(Direction.Left, s);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	f4.setNeighbors(hash5);
    	Box b1=new Box();
    	Player p4=new Player();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(p4);
    	p4.setField(f2);
    	s.setMovable(b4);
    	b4.setField(s);
    	p.Move(d);
		
	}

	private static void PlayerPushesManyThingsOntoSwitchWithPlayer() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Player p2=new Player();
		h.SetOpen(false);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	hash4.put(Direction.Right, f4);
    	Hashtable <Direction,Field> hash5=new Hashtable<Direction,Field>();
    	hash5.put(Direction.Left, s);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	f4.setNeighbors(hash5);
    	Box b1=new Box();
    	Player p4=new Player();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(p4);
    	p4.setField(f2);
    	s.setMovable(p2);
    	p2.setField(s);
    	p.Move(d);					
		
	}

	private static void PlayerPushesManyThingsOntoSwitch() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	Box b1=new Box();
    	Player p4=new Player();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(p4);
    	p4.setField(f2);
    	p.Move(d);
		
	}

	private static void PlayerPushesManyThingsIntoHole(boolean isOpen) {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Hole h=new Hole();
		h.SetOpen(isOpen);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, h);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	h.setNeighbors(hash4);
    	Box b1=new Box();
    	Player p4=new Player();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(p4);
    	p4.setField(f2);
    	p.Move(d);
		
	}

	private static void PlayerPushesManyThingsIntoWall() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Wall w=new Wall();
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, w);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	w.setNeighbors(hash4);
    	Box b1=new Box();
    	Player p4=new Player();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(p4);
    	p4.setField(f2);
    	p.Move(d);
		
	}

	private static void PlayerPushesManyThings() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, f4);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	f4.setNeighbors(hash4);
    	Box b1=new Box();
    	Player p4=new Player();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(p4);
    	p4.setField(f2);
    	p.Move(d);
		
	}

	private static void PlayerPushesManyBoxesOntoPointField(boolean fieldCompleted) {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		PointField pf=new PointField();
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, pf);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	pf.setNeighbors(hash4);
    	Box b1=new Box();
    	Box b2=new Box();
    	pf.setCompleted(fieldCompleted);
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	p.Move(d);
		
	}

	private static void PlayerPushesManyBoxesOntoSwitchWithPlayerKillPlayer() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Player p3=new Player();
		Player p2=new Player();
		h.SetOpen(false);
		p2.setField(h);
		h.setMovable(p2);		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	hash4.put(Direction.Right, f4);
    	Hashtable <Direction,Field> hash5=new Hashtable<Direction,Field>();
    	hash5.put(Direction.Left, s);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	f4.setNeighbors(hash5);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	s.setMovable(p3);
    	p3.setField(s);
    	p.Move(d);			
		
	}

	private static void PlayerPushesManyBoxesOntoSwitchWithPlayerKillBox() {
		Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Player p3=new Player();
		Box b3=new Box();
		h.SetOpen(false);
		b3.setField(h);
		h.setMovable(b3);		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	hash4.put(Direction.Right, f4);
    	Hashtable <Direction,Field> hash5=new Hashtable<Direction,Field>();
    	hash5.put(Direction.Left, s);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	f4.setNeighbors(hash5);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	s.setMovable(p3);
    	p3.setField(s);
    	p.Move(d);											
	}

	private static void PlayerPushesManyBoxesOntoSwitchWithPlayer() {
    	
		Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, f4);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	f4.setNeighbors(hash4);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
p.Move(d);							
	}

	private static void PlayerPushesManyBoxesOntoSwitchWithBoxKillPlayer() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Box b4=new Box();
		Player p2=new Player();
		h.SetOpen(false);
		p2.setField(h);
		h.setMovable(p2);		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	hash4.put(Direction.Right, f4);
    	Hashtable <Direction,Field> hash5=new Hashtable<Direction,Field>();
    	hash5.put(Direction.Left, s);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	f4.setNeighbors(hash5);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	s.setMovable(b4);
    	b4.setField(s);
    	p.Move(d);								
	}

	private static void PlayerPushesManyBoxesOntoSwitchWithBoxKillBox() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Box b4=new Box();
		Box b3=new Box();
		h.SetOpen(false);
		b3.setField(h);
		h.setMovable(b3);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	hash4.put(Direction.Right, f4);
    	Hashtable <Direction,Field> hash5=new Hashtable<Direction,Field>();
    	hash5.put(Direction.Left, s);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	f4.setNeighbors(hash5);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	s.setMovable(b4);
    	b4.setField(s);
    	p.Move(d);							
	}		
	

	private static void PlayerPushesManyBoxesOntoSwitchWithBox() {
    	Player p=new Player();
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Field f4=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Box b4=new Box();
		h.SetOpen(false);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	hash4.put(Direction.Right, f4);
    	Hashtable <Direction,Field> hash5=new Hashtable<Direction,Field>();
    	hash5.put(Direction.Left, s);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	f4.setNeighbors(hash5);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	s.setMovable(b4);
    	b4.setField(s);
    	p.Move(d);							
	}

	private static void PlayerPushesManyBoxesOntoSwitchKillPlayer() {
		Game game =new Game();
		ArrayList <Player> players=new ArrayList<Player>();
    	Player p=new Player();
    	players.add(p);
    	p.setAlive(true);
    	game.setPlayers(players);
    	game.setActiveBoxes(10);
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Player p2=new Player();
		h.SetOpen(false);
		p2.setField(h);
		p2.setGame(game);
		players.add(p2);
		h.setMovable(p2);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	game.setPlayers(players);
    	p.Move(d);							
	}

	private static void PlayerPushesManyBoxesOntoSwitchKillBox() {
		Game game =new Game();
		ArrayList <Player> players=new ArrayList<Player>();
		
    	Player p=new Player();
    	players.add(p);
    	p.setAlive(true);
    	game.setPlayers(players);
    	game.setActiveBoxes(10);
    	Field f=new Field();
		Field f2=new Field();
		Field f3=new Field();
		Switch s=new Switch();
		Hole h=new Hole();
		s.setHole(h);
		Box b3=new Box();
		h.SetOpen(false);
		b3.setField(h);
		b3.setGame(game);
		h.setMovable(b3);
		Direction d=Direction.Right;
		Hashtable <Direction,Field> hash=new Hashtable<Direction,Field>();
    	hash.put(Direction.Left, f);
    	Hashtable <Direction,Field> hash2=new Hashtable<Direction,Field>();
    	hash2.put(Direction.Right, f3);
    	Hashtable <Direction,Field> hash3=new Hashtable<Direction,Field>();
    	hash3.put(Direction.Left, f3);
    	hash3.put(Direction.Right, s);
    	hash.put(Direction.Right, f2);
    	Hashtable <Direction,Field> hash4=new Hashtable<Direction,Field>();
    	hash4.put(Direction.Left, f2);
    	f.setNeighbors(hash2);
    	f3.setNeighbors(hash);
    	f2.setNeighbors(hash3);
    	s.setNeighbors(hash4);
    	Box b1=new Box();
    	Box b2=new Box();
    	f.setMovable(p);
    	p.setField(f);
    	f3.setMovable(b1);
    	b1.setField(f3);
    	f2.setMovable(b2);
    	b2.setField(f2);
    	p.Move(d);							
	}
	 private static void NewGameStarts() {
			Game g=new Game();
			Board b=new Board();
			g.setBoard(b);
	    	g.StartGame();
	}

	

			
}
    
    
