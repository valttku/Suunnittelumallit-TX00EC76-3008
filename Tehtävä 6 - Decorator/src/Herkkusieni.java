public class Herkkusieni extends Täytteet {

    private double hinta = 2.75;

    public Herkkusieni(Pizza pizza) {
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    public String haeTiedot() {
        return pizza.haeTiedot() + ", herkkusieni";
    }

}
