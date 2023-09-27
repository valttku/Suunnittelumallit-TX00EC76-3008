public class Meetvursti extends Täytteet {

    private double hinta = 3.0;

    public Meetvursti(Pizza pizza) {
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    public String haeTiedot() {
        return pizza.haeTiedot() + ", meetvursti";
    }

}
