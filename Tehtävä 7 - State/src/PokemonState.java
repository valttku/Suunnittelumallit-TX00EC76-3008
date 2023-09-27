public abstract class PokemonState {

    void attack() {};
    void earnXP() {};
    void levelUp() {};
    void evolve(PokemonEvolution pE) {};
    void changeState(PokemonEvolution pE, PokemonState pS) {
        pE.changeState(pS);
    }

}
