import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> players = new ArrayList<>();
        players.add("Pelaaja 1");
        players.add("Pelaaja 2");
        players.add("Pelaaja 3");
        players.add("Pelaaja 4");
        players.add("Pelaaja 5");
        players.add("Pelaaja 6");

        SnakesAndLadders game = new SnakesAndLadders(players);
        game.playOneGame(players.size());

    }

}