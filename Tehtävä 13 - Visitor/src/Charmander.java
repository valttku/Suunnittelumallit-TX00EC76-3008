public class Charmander extends PokemonState {

    private static Charmander instance;
    private Charmander() {}

    public static Charmander getInstance() {
        if (instance == null) {
            instance = new Charmander();
        }
        return instance;
    }

    @Override
    public void accept(BonusVisitor bonusVisitor) {
        bonusVisitor.visit(this);
    }

    public void evolve(PokemonEvolution pE) {
        changeState(pE, Charmeleon.getInstance());
        System.out.println("Charmander kehittyy Charmeleoniksi!");
    }

}
