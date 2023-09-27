public class PokemonEvolution {

    private PokemonState state;

    public PokemonEvolution() {
        state = Charmander.getInstance();
    }

    protected void changeState(PokemonState pS) {
        state = pS;
    }

    public void attack() {
        state.attack();
    }

    public void levelUp() {
        state.levelUp();
    }

    public void evolve(PokemonEvolution pE) {
        state.evolve(pE);
    }

}
