public class Interface {
     public static void main(String[] args) {
     Queen q = new Queen();
         q.moves();
     }
}
interface Herbivore{

}
interface Carnivor{

}
class Bear implements Herbivore,Carnivor{
     
}

interface  ChessPlayer{
     void moves();
}

class Queen implements ChessPlayer{
  public void moves(){
          System.out.println("up, down, left, right, diagnol");
     }
}

class Rook implements ChessPlayer{
  public void moves(){
          System.out.println("up, down, left, right");
     }
}
class King implements ChessPlayer{
  public void moves(){
          System.out.println("up, down, left, right, diagnol(1 Step)");
     }
}
