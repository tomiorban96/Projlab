package main;

import java.util.Scanner;

public class Skeleton {
    public static void main(String args[]){
        PrintMenu();
    }

    private static void PrintMenu(){

        Scanner sc = new Scanner(System.in);

        System.out.print("1. Játék indítása\n2. Játékos mozog...\n3. Játékos tol...\n4. Játékos hozzáadása\n5. Kilépés\n $");

        try {
            switch (sc.nextInt()){
                case 1:
                    //Todo: Játék indítása
                    break;

                case 2:
                    System.out.print("1. ...üres mezőre\n2. ...falnak\n3. ...lyukra\n4. ...kapcsolóra, ami...\n5. ...pontszerző mezőre\n$ ");
                    switch (sc.nextInt()){
                        case 1:
                            //Todo: Játékos mozog üres mezőre
                            break;

                        case 2:
                            //Todo: Játékos mozog falnak
                            break;

                        case 3:
                            System.out.println("Lyuk nyitva van? (Y/N)");


                            char choice = (char)System.in.read();
                            boolean isOpen = getYesOrNo(choice);

                            System.out.println("Utolsó aktív játékos? (Y/N)");

                            choice = (char)System.in.read();
                            boolean lastActivePlayer = getYesOrNo(choice);

                            //Todo: Játékos mozog lyukra, isOpen és lastActivePlayer változóktól függően

                            break;

                        case 4:
                            System.out.println("1. ...üres, és a hozzá tartozó lyukon...\n 2. ...foglalt (láda), és a hozzá tartozó lyukon…\n 3. ...foglalt (munkás), és a hozzá tartozó lyukon...\n$ ");
                            switch (sc.nextInt()){
                                case 1:
                                    printSubMenu();

                                    break;

                                case 2:
                                    printSubMenu();

                                    break;

                                case 3:
                                    printSubMenu();

                                    break;

                                default:
                                    System.out.println("Nem létező menüpont!");
                            }

                        default:
                            System.out.println("Nem létező menüpont!");
                    }
                    break;

                case 3:
                    System.out.println("Játékos tol…");

                    break;

                case 4:
                    System.out.println("Játékos hozzáadása");

                    break;

                case 5:
                    System.out.println("Kilépés");

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
