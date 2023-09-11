public class Näytönohjain implements Laiteosa {

    private double hinta;

    public Näytönohjain(double hinta) {
        this.hinta = hinta;
    }

    public double haeLaiteosanHinta() {
        return hinta;
    }
}