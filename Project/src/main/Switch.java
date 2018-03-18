package main;

public class Switch extends Field {

    private Hole hole;

    public boolean Accept(Player p, Player pusher, Direction d){
        System.out.println("Switch.Accept()");
        if (movable!=null){                                     //ha van rajta valami
            if (movable.PushedBy(pusher,b,d)){                  //ha azt el lehet tolni
                System.out.println("Switch.Accept() returns true");
                return true;    
            }
            else{                                               //ha azt nem lehet eltolni 
                System.out.println("Switch.Accept() returns false");             
                return false;
            }
        }
        else{                                                  //ha nincs rajta semmi
            System.out.println("Switch.Accept() returns true");
            return true;
        }
    }

    public boolean Accept(Box b, Player pusher, Direction d){
        System.out.println("Switch.Accept()");
        if (movable!=null){                                     //ha van rajta valami
            if (movable.PushedBy(pusher,b,d)){                  //ha azt el lehet tolni
                hole.SetOpen(true);
                System.out.println("Switch.Accept() returns true");
                return true;
            }
            else {                                              //ha azt nem lehet eltolni
                System.out.println("Switch.Accept() returns false");
                return false;
            }
        }
        else {                                                  //ha nincs rajta semmi
            hole.SetOpen(true);
            System.out.println("Switch.Accept() returns true");
            return true;
        }
    }
}
