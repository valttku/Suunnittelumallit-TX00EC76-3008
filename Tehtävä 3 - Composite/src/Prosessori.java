public class Prosessori implements Laiteosa {

    private double hinta;

    public Prosessori(double hinta) {
        this.hinta = hinta;
    }

    public double haeLaiteosanHinta() {
        return hinta;
    }
}