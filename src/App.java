import board.Board;
import player.Player;
import java.util.*;
import triplet.Triplets;
import game.Game;

public class App {
    public static void main(String[] args) {
        Player p = new Player();

        Board b = new Board(9);
        List<Triplets> triple = new ArrayList<>();
        triple.add(new Triplets(0,0,3));
        triple.add(new Triplets(0,2,6));
        triple.add(new Triplets(0,3,3));
        triple.add(new Triplets(0,5,8));
        triple.add(new Triplets(0,6,4));
        triple.add(new Triplets(1,0,5));
        triple.add(new Triplets(1,1,2));
        triple.add(new Triplets(2,1,8));
        triple.add(new Triplets(2,2,7));
        triple.add(new Triplets(2,7,3));
        triple.add(new Triplets(2,8,1));
        triple.add(new Triplets(4,0,9));
        triple.add(new Triplets(4,3,8));
        triple.add(new Triplets(4,4,6));
        triple.add(new Triplets(4,5,3));
        triple.add(new Triplets(4,8,5));
        triple.add(new Triplets(5,1,3));
        triple.add(new Triplets(5,4,9));
        triple.add(new Triplets(6,0,1));
        triple.add(new Triplets(8,2,5));

b.setBoardTriplet(triple);
p.setPlayerName("Drishti");
Game g = new Game(b,p);
g.play();




    }
}