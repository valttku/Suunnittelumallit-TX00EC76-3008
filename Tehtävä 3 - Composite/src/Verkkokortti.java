public class Verkkokortti implements Laiteosa {

    private double hinta;

    public Verkkokortti(double hinta) {
        this.hinta = hinta;
    }

    public double haeLaiteosanHinta() {
        return hinta;
    }
}