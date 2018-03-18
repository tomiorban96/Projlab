package main;

public class PointField extends Field {

    private boolean completed;
    private Game game;

    public boolean Accept(Player p, Player pusher, Direction d){
        System.out.println("PointField.Accept()");
        
        if (movable!=null){                                                      //ha van rajta valami
            if (completed){                                                      //ha láda van rajta
                System.out.println("PointField.Accept() returns false");    
                return false;
            }
            else{
                if (movable.PushedBy(pusher,p,d)){                               //ha azt el lehet tolni
                    System.out.println("PointField.Accept() returns true");
                    return true;
                }
                else{
                    System.out.println("PointField.Accept() returns false");    //ha nem
                    return false;
                }
            }
        }
        else{
            System.out.println("PointField.Accept() returns true");             //ha nincs rajta semmi
            return true;
        }
    }

    public boolean Accept(Box b, Player pusher, Direction d){
        System.out.println("PointField.Accept()");
        if (movable!=null){                                                      //ha van rajta valami
            if (completed){                                                      //ha láda van rajta
                System.out.println("PointField.Accept() returns false");    
                return false;
            }
            else{
                if (movable.PushedBy(pusher,b,d)){                               //ha azt el lehet tolni
                    completed=true;
                    pusher.AddPoint();
                    game.DecActiveBoxes();
                    game.CheckEndGame();
                    System.out.println("PointField.Accept() returns true");
                    return true;
                }
                else{
                    System.out.println("PointField.Accept() returns false");    //ha nem
                    return false;
                }
            }
        }
        else{
            pusher.AddPoint();
            completed=true;
            game.DecActiveBoxes();
            game.CheckEndGame();
            System.out.println("PointField.Accept() returns true");             //ha nincs rajta semmi
            return true;
        }
        return false; 
    }
}
