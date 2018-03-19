package main;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Skeleton {
    public static void main(String args[]){
        PrintMenu();
    }

    private static void PrintMenu(){

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("1. Játék indítása\n2. Játékos mozog...\n3. Játékos tol...\n4. Játékos hozzáadása\n5. Kilépés\n$ ");

            switch (sc.nextInt()){
                case 1: //1
                    //Todo: Játék indítása
                    break;

                case 2: //2
                    System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                    switch (sc.nextInt()){
                        case 1: //2.1
                            //Todo: Játékos mozog üres mezőre
                            break;

                        case 2: //2.2
                            //Todo: Játékos mozog falnak
                            break;

                        case 3: //2.3
                            System.out.println("Lyuk nyitva van? (Y/N)");

                            boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                            System.out.println("Utolsó aktív játékos? (Y/N)");

                            boolean lastActivePlayer = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                            //Todo: Játékos mozog lyukra, isOpen és lastActivePlayer változóktól függően

                            break;

                        case 4: //2.4
                            System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                            switch (sc.nextInt()){
                                case 1: //2.4.1
                                    printSubMenu();

                                    switch (sc.nextInt()){
                                        case 1: //2.4.1.1
                                            
                                        	PlayerOntoEmptySwitch();
                                            break;

                                        case 2: //2.4.1.2
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoEmptySwitchKillBox(lastActiveBox);
                                            
                                            break;

                                        case 3: //2.4.1.3
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoEmptySwitchKillPlayer(lastActivePlayer2);
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }

                                    break;

                                case 2: //2.4.2
                                    printSubMenu();
                                    switch (sc.nextInt()){
                                        case 1: //2.4.2.1
                                        	PlayerOntoSwitchWithBox();
                                            
                                            break;

                                        case 2: //2.4.2.2
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoSwitchWithBoxKillBox(lastActiveBox);
                                            break;

                                        case 3: //2.4.2.3
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoSwitchWithBoxKillPlayer();
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;

                                case 3: //2.4.3
                                    printSubMenu();
                                    switch (sc.nextInt()){
                                        case 1: //2.4.3.1
                                        	PlayerOntoSwitchWithPlayer();
                                            break;

                                        case 2: //2.4.3.2
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            PlayerOntoSwitchWithPlayerKillBox();
                                            break;

                                        case 3: //2.4.3.3
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

                        case 5: //2.5
                            System.out.println("Mező teljesítve? (Y/N)");
                            boolean fieldCompleted = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                            //Todo: Játékos mozog pontszerző mezőre
                            break;

                        default:
                            System.out.println("Nem létező menüpont!");
                    }
                    break;

                case 3: //3
                    System.out.print("1. ...ládát...\n2. ...játékost...\n3. ...több ládából álló sort...\n4. ...ládákból és játékosokból vegyesen álló sort...\n$ ");

                    switch (sc.nextInt()){
                        case 1: //3.1
                            System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                            switch (sc.nextInt()){
                                case 1: //3.1.1
                                    //Todo: Játékos tol ládát üres mezőre
                                    break;

                                case 2: //3.1.2
                                    //Todo: Játékos tol ládát falnak
                                    break;

                                case 3: //3.1.3
                                    System.out.println("Lyuk nyitva van? (Y/N)");

                                    boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                                    System.out.println("Utolsó láda? (Y/N)");

                                    boolean lastActivePlayer = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                                    //Todo: Játékos tol ládát lyukra, isOpen és lastActivePlayer változóktól függően

                                    break;

                                case 4: //3.1.4
                                    System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.1.4.1
                                            printSubMenu();

                                            switch (sc.nextInt()){
                                                case 1: //3.1.4.1.1
                                                    //Todo: Játékos tol ládát kapcsolóra, ami üres, és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.1.4.1.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládát kapcsolóra, ami üres, és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.1.4.1.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládát kapcsolóra, ami üres, és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }

                                            break;

                                        case 2: //3.1.4.2
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.1.4.2.1
                                                    //Todo: Játékos tol ládát kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.1.4.2.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládát kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.1.4.2.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládát kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        case 3: //3.1.4.3
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.1.4.3.1
                                                    //Todo: Játékos tol ládát kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.1.4.3.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládát kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.1.4.3.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládát kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;

                                case 5: //3.1.5
                                    System.out.println("Mező teljesítve? (Y/N)");
                                    boolean fieldCompleted = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    //Todo: Játékos tol ládát pontszerző mezőre

                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
                            break;

                        case 2: //3.2
                        	PlayerPushPlayer();
                        	break;
                        case 3: //3.3
                            System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                            switch (sc.nextInt()){
                                case 1: //3.3.1
                                    //Todo: Játékos tol több ládából álló sort üres mezőre
                                    break;

                                case 2: //3.3.2
                                    //Todo: Játékos tol több ládából álló sort falnak
                                    break;

                                case 3: //3.3.3
                                    System.out.println("Lyuk nyitva van? (Y/N)");

                                    boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                                    System.out.println("Utolsó aktív? (Y/N)");

                                    boolean last = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                                    //Todo: Játékos tol több ládából álló sort lyukra, isOpen és last változóktól függően

                                    break;

                                case 4: //3.3.4
                                    System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.3.4.1
                                            printSubMenu();

                                            switch (sc.nextInt()){
                                                case 1: //3.3.4.1.1
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami üres, és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.3.4.1.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami üres, és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.3.4.1.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami üres, és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }

                                            break;

                                        case 2: //3.3.4.2
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.3.4.2.1
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.3.4.2.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.3.4.2.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        case 3: //3.3.4.3
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.3.4.3.1
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.3.4.3.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.3.4.3.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol több ládából álló sort kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon játékos áll
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
                                    //Todo: Játékos tol több ládából álló sort pontszerző mezőre

                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
                            break;

                        case 4: //3.4
                            System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                            switch (sc.nextInt()){
                                case 1: //3.4.1
                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort üres mezőre
                                    break;

                                case 2: //3.4.2
                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort falnak
                                    break;

                                case 3: //3.4.3
                                    System.out.println("Lyuk nyitva van? (Y/N)");

                                    boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                                    System.out.println("Utolsó aktív? (Y/N)");

                                    boolean last = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort lyukra, isOpen és last változóktól függően

                                    break;

                                case 4: //3.4.4
                                    System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.4.4.1
                                            printSubMenu();

                                            switch (sc.nextInt()){
                                                case 1: //3.4.4.1.1
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami üres, és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.4.4.1.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami üres, és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.4.4.1.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami üres, és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }

                                            break;

                                        case 2: //3.4.4.2
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.4.4.2.1
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.4.4.2.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.4.4.2.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        case 3: //3.4.4.3
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.4.4.3.1
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.4.4.3.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.4.4.3.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;

                                case 5: //3.4.5
                                    System.out.println("Mező teljesítve? (Y/N)");
                                    boolean fieldCompleted = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    //Todo: Játékos tol ládákból és játékosokból vegyesen álló sort pontszerző mezőre

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
                    //Todo: Kilépés
                    break;

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
		p2.SetField(f2);
		f3.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
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
		p2.SetField(s);
		s.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
		s.setHole(h);
		h.setMovable(p3);
		p3.SetField(h);
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
		p2.SetField(s);
		s.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
		s.setHole(h);
		h.setMovable(b);
		b.SetField(h);
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
		p2.SetField(s);
		s.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
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
		b.SetField(s);
		s.setMovable(b);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
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
		b.SetField(s);
		s.setMovable(b);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
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
		b.SetField(s);
		s.setMovable(b);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
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
		p2.SetField(h);
		h.setMovable(p2);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
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
		b.SetField(h);
		h.setMovable(b);
		Direction d=Direction.Right;
		f.setMovable(p);
		p.SetField(f);
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
		p.SetField(f);
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
    
}
