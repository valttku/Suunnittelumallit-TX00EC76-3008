public abstract class PokemonState {

    void accept(BonusVisitor bonusVisitor) {};
    void evolve(PokemonEvolution pE) {};
    void changeState(PokemonEvolution pE, PokemonState pS) {
        pE.changeState(pS);
    }

}
