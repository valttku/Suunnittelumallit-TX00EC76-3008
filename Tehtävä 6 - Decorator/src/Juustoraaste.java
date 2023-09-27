public class Juustoraaste extends Täytteet {

    private double hinta = 2.5;

    public Juustoraaste(Pizza pizza) {
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    public String haeTiedot() {
        return pizza.haeTiedot() + ", juustoraaste";
    }

}
