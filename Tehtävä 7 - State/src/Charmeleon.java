public class Charmeleon extends PokemonState {

    private static Charmeleon instance;
    private int xp = 0;
    private int level = 1;

    private Charmeleon() {}

    public static Charmeleon getInstance() {
        if (instance == null) {
            instance = new Charmeleon();
        }
        return instance;
    }

    public void attack() {
        System.out.print("Charmeleon raapaisee vihollista kynsillään. ");
        earnXP();
    }

    public void earnXP() {
        xp += 100;
        System.out.println("Charmeleon keräsi 100 kokemuspistettä!");
    }

    public void levelUp() {
        if (xp >= 600) {
            level++;
            System.out.println("\nCharmeleon pääsi tasolle " + level + "!\n");
            xp = 0;
        }
    }

    public void evolve(PokemonEvolution pE) {
        if (level >= 6) {
            changeState(pE, Charizard.getInstance());
            System.out.println("Charmeleon kehittyy Charizardiksi!\n");
        }
    }

}
