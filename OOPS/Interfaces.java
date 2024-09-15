package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("all possible");
    }
}
class Elephant implements ChessPlayer{
    public void moves(){
        System.out.println("all except diagonal one");
    }
}
