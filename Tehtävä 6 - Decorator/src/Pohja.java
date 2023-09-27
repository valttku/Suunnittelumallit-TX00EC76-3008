public class Pohja implements Pizza {

    private double hinta = 5.0;

    @Override
    public double haeHinta() {
        return hinta;
    }

    @Override
    public String haeTiedot() {
        return "Pitsapohja";
    }

}
