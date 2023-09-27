public class Charizard extends PokemonState {

    private static Charizard instance;
    private int xp = 0;
    private int level = 1;

    private Charizard() {}

    public static Charizard getInstance() {
        if (instance == null) {
            instance = new Charizard();
        }
        return instance;
    }

    public void attack() {
        System.out.print("Charizard puhaltaa tulta vihollisen päälle. ");
        earnXP();
    }

    public void earnXP() {
        xp += 150;
        System.out.println("Charizard keräsi 150 kokemuspistettä!");
    }

    public void levelUp() {
        if (xp >= 900) {
            level++;
            System.out.println("\nCharizard pääsi tasolle " + level + "!\n");
            xp = 0;
        }
    }

}
