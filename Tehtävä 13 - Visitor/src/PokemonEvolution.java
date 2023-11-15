public class PokemonEvolution {

    private PokemonState state;

    public PokemonEvolution() {
        state = Charmander.getInstance();
    }

    protected void changeState(PokemonState pS) {
        state = pS;
    }

    public void evolve(PokemonEvolution pE) {
        state.evolve(pE);
    }

}