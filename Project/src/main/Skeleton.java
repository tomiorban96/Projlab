package main;

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
                                            //Todo: Játékos mozog kapcsolóra, ami üres, és a hozzá tartozó lyukon nincs semmi
                                            break;

                                        case 2: //2.4.1.2
                                            System.out.println("Utolsó aktív láda? (Y/N)");
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            //Todo: Játékos mozog kapcsolóra, ami üres, és a hozzá tartozó lyukon láda áll
                                            break;

                                        case 3: //2.4.1.3
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
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
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            //Todo: Játékos mozog kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon láda áll
                                            break;

                                        case 3: //2.4.2.3
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
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
                                            boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                            //Todo: Játékos mozog kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon láda áll
                                            break;

                                        case 3: //2.4.3.3
                                            System.out.println("Utolsó aktív játékos? (Y/N)");
                                            boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
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

                                    boolean isOpen = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                                    boolean lastActivePlayer = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));

                                    //Todo: Játékos tol játékost lyukra, isOpen és lastActivePlayer változóktól függően

                                    break;

                                case 4: //3.2.4
                                    System.out.print("1. ...üres, és a hozzá tartozó lyukon...\n2. ...foglalt (láda), és a hozzá tartozó lyukon…\n3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                                    switch (sc.nextInt()){
                                        case 1: //3.2.4.1
                                            printSubMenu();

                                            switch (sc.nextInt()){
                                                case 1: //3.2.4.1.1
                                                    //Todo: Játékos tol játékost kapcsolóra, ami üres, és a hozzá tartozó lyukon nincs semmi
                                                    break;

                                                case 2: //3.2.4.1.2
                                                    System.out.println("Utolsó aktív láda? (Y/N)");
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol játékost kapcsolóra, ami üres, és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.2.4.1.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
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
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol játékost kapcsolóra, ami foglalt (láda), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.2.4.2.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
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
                                                    boolean lastActiveBox = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                                    //Todo: Játékos tol játékost kapcsolóra, ami foglalt (munkás), és a hozzá tartozó lyukon láda áll
                                                    break;

                                                case 3: //3.2.4.3.3
                                                    System.out.println("Utolsó aktív játékos? (Y/N)");
                                                    boolean lastActivePlayer2 = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
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
                                    boolean fieldCompleted = getYesOrNo(sc.next().replaceAll("\n", "").charAt(0));
                                    //Todo: Játékos játékost ládát pontszerző mezőre

                                default:
                                    System.out.println("Nem létező menüpont!");
                            }
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
    private static void Jatekoslyukra(boolean isOpen, boolean LastActivePlayer) {
    	ArrayList<Player> players=new ArrayList<Player>();
    	Player p=new Player();
    	Player p2=new Player();
    	Hashtable <Direction,Field> h=new Hashtable<Direction,Field>();
    	Hole h1=new Hole();
    	h1.SetOpen(false);
    	h.put(Direction.Down, h1);
    	Field f2=new Field();
    	f2.setMovable(p);
    	f2.setNeighbors(h);
    	p.setField(f2);
    	players.add(p);
    	if (isOpen) {
    		h1.SetOpen(true);
    	}
    	if (LastActivePlayer) {
    		players.add(p2);
    	}
    	Game game=new Game(players);
    	p.setGame(game);
    	p2.setGame(game);
    	p.Move(Direction.Down);
    }
    
}
