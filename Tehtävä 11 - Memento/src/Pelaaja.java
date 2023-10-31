import java.util.Random;

public class Pelaaja implements Runnable {

    private Arvuuttaja arvuuttaja;
    private int playerNumber;
    private Random random;

    public Pelaaja(Arvuuttaja arvuuttaja, int playerNumber) {
        this.arvuuttaja = arvuuttaja;
        this.playerNumber = playerNumber;
        random = new Random();
    }

    // Palauttaa true, jos arvaus meni oikein (haetaan Arvuttaja-luokan arvaa-metodista)
    public boolean correctAnswer() {
        // Arvotaan luku väliltä 0-9
        int guess = random.nextInt(10);
        System.out.println("Pelaaja " + playerNumber + " arvaa luvun " + guess);
        // Palautetaan luku arvuttajan haltuun
        return arvuuttaja.arvaa(arvuuttaja.liityPeliin(), guess);
    }

    @Override
    public void run() {
        while(!correctAnswer()) {
            try {
                // Arvauskerta kestää vähintään sekunnin ja enintään 2 sekuntia
                Thread.sleep(1000 + random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n* Pelaaja " + playerNumber + " arvasi oikein! *\n");
    }

}
