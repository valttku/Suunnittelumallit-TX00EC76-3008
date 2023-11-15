public class Main {

    public static void main(String[] args) {

        PokemonEvolution pokemonEvolution = new PokemonEvolution();
        BonusVisitor bonusVisitor = new BonusVisitor();

        // Luodaan pokemonit
        Charmander pokemon1 = Charmander.getInstance();
        Charmeleon pokemon2 = Charmeleon.getInstance();
        Charizard pokemon3 = Charizard.getInstance();

        // Annetaan bonuspisteet
        pokemon1.accept(bonusVisitor);
        pokemon2.accept(bonusVisitor);
        pokemon3.accept(bonusVisitor);

    }

}