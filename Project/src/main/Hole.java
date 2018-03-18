package main;

public class Hole extends Field {

    private boolean open;

    public boolean Accept(Player p, Player pusher, Direction d){
        System.out.println("Hole.Accept()");
         if (movable!=null){                                     //van rajta valami
            if (movable.PushedBy(pusher,p,d)){                  //ha el lehet tolni
                if (open){                                      // ha a lyuk nyitva van
                    p.Die();
                }
                System.out.println("Hole.Accept() returns true");
                return true;
            }
            else{                                               //ha nem lehet eltolni
                System.out.println("Hole.Accept() returns false");
                return false;
            }     
        }
        else{                                                   //nincs rajta semmi
            if (open){                                          // ha a lyuk nyitva van
                p.Die();
            }
            System.out.println("Hole.Accept() returns true");
            return true;
        }
    }

    public boolean Accept(Box b, Player pusher,Direction d){        //doboz mozog rá
        System.out.println("Hole.Accept()");                                                     
        if (movable!=null){                                     //van rajta valami
            if (movable.PushedBy(pusher,b,d)){                  //ha el lehet tolni
                if (open){                                      // ha a lyuk nyitva van
                    b.Die();
                }
                System.out.println("Hole.Accept() returns true");
                return true;
            }
            else{                                               //ha nem lehet eltolni
                System.out.println("Hole.Accept() returns false");
                return false;
            }     
        }
        else{                                                   //nincs rajta semmi
            if (open){                                          // ha a lyuk nyitva van
                b.Die();
            }
            System.out.println("Hole.Accept() returns true");
            return true;
        }
    }
    public boolean GetOpen(){
        System.out.println("Hole.GetOpen()");
        System.out.println("Hole.GetOpen() returns");
        return open;
    }

    public void SetOpen(boolean b){
        System.out.println("Hole.SetOpen()");
        open = b;
    }
}
