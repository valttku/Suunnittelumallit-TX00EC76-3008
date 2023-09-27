public class Main {

    public static void main(String[] args) throws InterruptedException {

        PokemonEvolution pE = new PokemonEvolution();
        while (true) {
            pE.attack();
            pE.levelUp();
            pE.evolve(pE);
            Thread.sleep(1000);
        }

    }
}