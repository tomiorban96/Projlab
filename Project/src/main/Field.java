package main;

import java.util.ArrayList;

public class Field {

    protected Thing movable;
    private Hashtable<Direction,Field> neighbors[];

    public boolean Accept(Player p, Player pusher, Direction d){
        System.out.println("Field.Accept()");
         if (movable!=null){                                     //van rajta valami
            if (movable.PushedBy(pusher,p,d)){                  //ha el lehet tolni
                System.out.println("Field.Accept() returns true");
                return true;
            }
            else{                                               //ha nem lehet eltolni
                System.out.println("Field.Accept() returns false");
                return false;
            }     
        }
        else{                                                   //nincs rajta semmi
            System.out.println("Field.Accept() returns true");
            return true;
        }
    }

    public boolean Accept(Box b, Player pusher){
        System.out.println("Field.Accept()");
         if (movable!=null){                                     //van rajta valami
            if (movable.PushedBy(pusher,b,d)){                  //ha el lehet tolni
                System.out.println("Field.Accept() returns true");
                return true;
            }
            else{                                               //ha nem lehet eltolni
                System.out.println("Field.Accept() returns false");
                return false;
            }     
        }
        else{                                                   //nincs rajta semmi
            System.out.println("Field.Accept() returns true");
            return true;
        }
    }

    public void Remove(Thing t){
        System.out.println("Field.Remove()");
        movable=null;
    }

    public Field GetNeighbor(Direction d){
       System.out.println("Field.GetNeighbor()");
       System.out.println("Field.GetNeighbor() returns");
       return neighbors.get(d);
    }

    Field(){
        movable = null;
        neighbors = new Hashtable<Direction,Field>();
    }
}
