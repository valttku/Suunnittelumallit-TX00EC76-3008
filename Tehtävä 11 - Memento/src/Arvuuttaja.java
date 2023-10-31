import java.util.Random;

public class Arvuuttaja {

    public Memento liityPeliin() {
        Random random = new Random();
        // Palautetaan Memento, jonka hallussa on luku väliltä 0-9
        return new Memento(random.nextInt(10));
    }

    // Vain yksi säie voi arvata kerrallaan
    public synchronized boolean arvaa(Memento memento, int guess) {
        if (memento.getRandomNumber() == guess) {
            return true;
        } else {
            return false;
        }
    }

    private class Memento {

        private int randomNumber;

        public Memento(int randomNumber) {
            this.randomNumber = randomNumber;
        }

        public int getRandomNumber() {
            return randomNumber;
        }

    }

}