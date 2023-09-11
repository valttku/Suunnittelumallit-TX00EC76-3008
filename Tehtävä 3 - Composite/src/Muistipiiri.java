public class Muistipiiri implements Laiteosa {

    private double hinta;

    public Muistipiiri(double hinta) {
        this.hinta = hinta;
    }

    public double haeLaiteosanHinta() {
        return hinta;
    }
}
