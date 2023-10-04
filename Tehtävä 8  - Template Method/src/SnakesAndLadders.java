import java.util.ArrayList;
import java.util.List;

public class SnakesAndLadders extends Game {

    private List<Integer> playerPositions;
    private List<String> playerNames;
    private Dice dice = new Dice();

    public SnakesAndLadders(List<String> playerNames) {
        this.playerNames = playerNames;
        this.playerPositions = new ArrayList<>();
        for (int i = 0; i < playerNames.size(); i++) {
            // Alustetaan kaikkien pelaajien asemaksi 0 pelilaudalla
            playerPositions.add(0);
        }
    }

    @Override
    void initializeGame() {
        System.out.println("Peli alkaa. Pelaajia yhteensä " + playerNames.size() + "\n");
    }

    @Override
    void makePlay(int player) throws InterruptedException {

        // Haetaan pelaajan tämänhetkinen ruutu pelilaudalta
        int currentPosition = playerPositions.get(player);
        // Heitetään noppaa
        int diceRoll = dice.throwDice();
        // Pelaaja liikkuu nopanheiton verran
        currentPosition += diceRoll;
        playerPositions.set(player, currentPosition);
        System.out.println(playerNames.get(player) + " heitti luvun " + diceRoll);

        // Tarkistetaan onko uudella ruudulla tikkaita tai käärmettä
        checkLadderAndSnake(player);

        // Yksi pelivuoro kestää 500ms per pelaaja
        Thread.sleep(500);
    }

    @Override
    boolean endOfGame() {
        // Tarkistetaan onko kukaan pelaajista ruudulla 100 tai enemmän
        for (int position : playerPositions) {
            if (position >= 100) {
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        for (int i = 0; i < playerPositions.size(); i++) {
            if (playerPositions.get(i) >= 100) {
                System.out.println(playerNames.get(i) + " pääsi maaliin!");
            }
        }
    }

    public void checkLadderAndSnake(int player) {

        // Haetaan tikkaiden alku- ja loppupäät pelilaudalta
        int[] ladderStart = {4, 8, 21, 28, 50, 71, 80};
        int[] ladderEnd = {14, 30, 42, 76, 67, 92, 99};

        // Haetaan käärmeiden alku- ja loppupäät pelilaudalta
        int [] snakeStart = {32, 36, 48, 62, 88, 95, 97};
        int [] snakeEnd = {10, 6, 26, 18, 24, 56, 78};

        // Haetaan pelaajan asema pelilaudalta
        int currentPosition = playerPositions.get(player);

        // Tarkistetaan onko pelaaja tikkaiden alkupäässä
        for (int i = 0; i < ladderStart.length; i++) {
            if (currentPosition == ladderStart[i]) {
                int newPosition = ladderEnd[i];
                playerPositions.set(player, newPosition);
                System.out.println(playerNames.get(player) + " kiipeää tikkaita ruudulta " + ladderStart[i] + " ruudulle " + newPosition + "\n");
                return;
            }
        }

        // Tarkistetaan onko pelaaja käärmeen alkupäässä
        for (int i = 0; i < snakeStart.length; i++) {
            if (currentPosition == snakeStart[i]) {
                int newPosition = snakeEnd[i];
                playerPositions.set(player, newPosition);
                System.out.println(playerNames.get(player) + " laskeutuu käärmettä pitkin ruudusta " + snakeStart[i] + " ruudulle " + newPosition + "\n");
                return;
            }
        }

        if (currentPosition < 100) {
            System.out.println(playerNames.get(player) + " menee ruutuun " + currentPosition + "\n");
        } else {
            System.out.println(playerNames.get(player) + " menee ruutuun 100" + "\n");
        }
    }

}
