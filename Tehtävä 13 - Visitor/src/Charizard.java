public class Charizard extends PokemonState {

    private static Charizard instance;
    private Charizard() {}

    public static Charizard getInstance() {
        if (instance == null) {
            instance = new Charizard();
        }
        return instance;
    }

    @Override
    public void accept(BonusVisitor bonusVisitor) {
        bonusVisitor.visit(this);
    }

}
