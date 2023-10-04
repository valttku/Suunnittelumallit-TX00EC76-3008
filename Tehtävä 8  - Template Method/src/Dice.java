import java.util.Random;

public class Dice {

    Random random = new Random();

    public int throwDice() {
        return random.nextInt(6) + 1;
    }

}
