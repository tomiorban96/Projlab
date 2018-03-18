package main;

import java.util.Scanner;

public class Skeleton {
    public static void main(String args[]){
        PrintMenu();
    }

    private static void PrintMenu(){

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("1. Játék indítása\n2. Játékos mozog...\n3. Játékos tol...\n4. Játékos hozzáadása\n5. Kilépés\n $");

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

                            boolean isOpen = getYesOrNo((char)System.in.read());

                            System.out.println("Utolsó aktív játékos? (Y/N)");

                            boolean lastActivePlayer = getYesOrNo((char)System.in.read());

                            //Todo: Játékos mozog lyukra, isOpen és lastActivePlayer változóktól függően

                            break;

                        case 4: //2.4
                            System.out.println("1. ...üres, és a hozzá tartozó lyukon...\n 2. ...foglalt (láda), és a hozzá tartozó lyukon…\n 3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                            switch (sc.nextInt()){
                                case 1: //2.4.1
                                    printSubMenu();

                                    switch (sc.nextInt()){
                                        case 1: //2.4.1.1
                                            //Todo: Játékos mozog kapcsolóra, ami üres, és a hozzá tartozó lyukon nincs semmi
                                            break;

                                        case 2: //2.4.1.2
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                            //Todo: Játékos mozog kapcsolóra, ami üres, és a hozzá tartozó lyukon láda áll
                                            break;

                                        case 3: //2.4.1.3
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
                                            //Todo: Játékos mozog kapcsolóra, ami üres, és a hozzá tartozó lyukon játékos áll
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }

                                    break;

                                case 2: //2.4.2
                                    printSubMenu();
                                    switch (sc.nextInt()){
                                        case 1: //2.4.2.1
                                            //Todo: Játékos mozog kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon nincs semmi
                                            break;

                                        case 2: //2.4.2.2
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                            //Todo: Játékos mozog kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon láda áll
                                            break;

                                        case 3: //2.4.2.3
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
                                            //Todo: Játékos mozog kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon játékos áll
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;

                                case 3: //2.4.3
                                    printSubMenu();
                                    switch (sc.nextInt()){
                                        case 1: //2.4.3.1
                                            //Todo: Játékos mozog kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon nincs semmi
                                            break;

                                        case 2: //2.4.3.2
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                            //Todo: Játékos mozog kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon láda áll
                                            break;

                                        case 3: //2.4.3.3
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
                                            //Todo: Játékos mozog kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon játékos áll
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
                            boolean fieldCompleted = getYesOrNo((char)System.in.read());
                            //Todo: Játékos mozog pontszerző mezőre

                        default:
                            System.out.println("Nem létező menüpont!");
                    }
                    break;

                case 3: //3
                    System.out.println("1. ...ládát...\n2. ...játékost...\n3. ...több ládából álló sort...\n 4. ...ládákból és játékosokból vegyesen álló sort...\n$ ");

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

                                    boolean isOpen = getYesOrNo((char)System.in.read());

                                    System.out.println("Utolsó aktív játékos? (Y/N)");

                                    boolean lastActivePlayer = getYesOrNo((char)System.in.read());

                                    //Todo: Játékos tol ládát lyukra, isOpen és lastActivePlayer változóktól függően

                                    break;

                                case 4: //3.1.4
                                    System.out.println("1. ...üres, és a hozzá tartozó lyukon...\n 2. ...foglalt (láda), és a hozzá tartozó lyukon…\n 3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.1.4.1
                                            printSubMenu();

                                            switch (sc.nextInt()){
                                                case 1: //3.1.4.1.1
                                                    //Todo: Játékos tol ládát kapcsolóra, ami üres, és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.1.4.1.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol ládát kapcsolóra, ami üres, és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.1.4.1.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
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
                                                    boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol ládát kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.1.4.2.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
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
                                                    boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol ládát kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.1.4.3.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
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
                                    boolean fieldCompleted = getYesOrNo((char)System.in.read());
                                    //Todo: Játékos tol ládát pontszerző mezőre

                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
                            break;

                        case 2: //3.2
                            System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                            switch (sc.nextInt()){
                                case 1: //3.2.1
                                    //Todo: Játékos tol játékost üres mezőre
                                    break;

                                case 2: //3.2.2
                                    //Todo: Játékos tol játékost falnak
                                    break;

                                case 3: //3.2.3
                                    System.out.println("Lyuk nyitva van? (Y/N)");

                                    boolean isOpen = getYesOrNo((char)System.in.read());

                                    System.out.println("Utolsó aktív játékos? (Y/N)");

                                    boolean lastActivePlayer = getYesOrNo((char)System.in.read());

                                    //Todo: Játékos tol játékost lyukra, isOpen és lastActivePlayer változóktól függően

                                    break;

                                case 4: //3.2.4
                                    System.out.println("1. ...üres, és a hozzá tartozó lyukon...\n 2. ...foglalt (láda), és a hozzá tartozó lyukon…\n 3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.2.4.1
                                            printSubMenu();

                                            switch (sc.nextInt()){
                                                case 1: //3.2.4.1.1
                                                    //Todo: Játékos tol játékost kapcsolóra, ami üres, és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.2.4.1.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol játékost kapcsolóra, ami üres, és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.2.4.1.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol játékost kapcsolóra, ami üres, és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }

                                            break;

                                        case 2: //3.2.4.2
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.2.4.2.1
                                                    //Todo: Játékos tol játékost kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.2.4.2.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol játékost kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.2.4.2.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol játékost kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        case 3: //3.2.4.3
                                            printSubMenu();
                                            switch (sc.nextInt()){
                                                case 1: //3.2.4.3.1
                                                    //Todo: Játékos tol játékost kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.2.4.3.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol játékost kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.2.4.3.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo((char)System.in.read());
                                                    //Todo: Játékos tol játékost kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon játékos áll
                                                    break;

                                                default:
                                                    System.out.println("Nem létező menüpont!");
                                            }
                                            break;

                                        default:
                                            System.out.println("Nem létező menüpont!");
                                    }
                                    break;

                                case 5: //3.2.5
                                    System.out.println("Mező teljesítve? (Y/N)");
                                    boolean fieldCompleted = getYesOrNo((char)System.in.read());
                                    //Todo: Játékos játékost ládát pontszerző mezőre

                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
                            break;

                        case 3: //3.3

                            break;

                        case 4: //3.4

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

    private static boolean getYesOrNo(char choice) throws Exception{
        if (choice  == 'Y')
            return true;
        else if (choice == 'N')
            return false;
        else
            throw new Exception("Rossz bemeneti paraméter! (Y/N)");
    }

    private static void printSubMenu(){
        System.out.println("1. ...nincs semmi\n2. ...láda áll\n 3. ...játékos áll\n$ ");
    }
}
