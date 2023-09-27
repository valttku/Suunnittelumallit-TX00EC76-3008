public class Seitan extends Täytteet {

    private double hinta = 4.25;

    public Seitan(Pizza pizza) {
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    public String haeTiedot() {
        return pizza.haeTiedot() + ", seitan";
    }

}
