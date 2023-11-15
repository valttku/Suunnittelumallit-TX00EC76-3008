public class Charmeleon extends PokemonState {

    private static Charmeleon instance;
    private Charmeleon() {}

    public static Charmeleon getInstance() {
        if (instance == null) {
            instance = new Charmeleon();
        }
        return instance;
    }

    @Override
    public void accept(BonusVisitor bonusVisitor) {
        bonusVisitor.visit(this);
    }

    public void evolve(PokemonEvolution pE) {
        changeState(pE, Charizard.getInstance());
        System.out.println("Charmeleon kehittyy Charizardiksi!");
    }

}
