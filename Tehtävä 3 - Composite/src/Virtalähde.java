public class Virtalähde implements Laiteosa {

    private double hinta;

    public Virtalähde(double hinta) {
        this.hinta = hinta;
    }

    public double haeLaiteosanHinta() {
        return hinta;
    }
}
