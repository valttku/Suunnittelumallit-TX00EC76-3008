public class Charmander extends PokemonState {

    private static Charmander instance;
    private int xp = 0;
    private int level = 1;

    private Charmander() {}

    public static Charmander getInstance() {
        if (instance == null) {
            instance = new Charmander();
        }
        return instance;
    }

    public void attack() {
        System.out.print("Charmander heittää tulipallon vihollista päin. ");
        earnXP();
    }

    public void earnXP() {
        xp += 50;
        System.out.println("Charmander keräsi 50 kokemuspistettä!");
    }

    public void levelUp() {
        if (xp >= 200) {
            level++;
            System.out.println("\nCharmander pääsi tasolle " + level + "!\n");
            xp = 0;
        }
    }

    public void evolve(PokemonEvolution pE) {
        if (level >= 3) {
            changeState(pE, Charmeleon.getInstance());
            System.out.println("Charmander kehittyy Charmeleoniksi!\n");
        }
    }

}