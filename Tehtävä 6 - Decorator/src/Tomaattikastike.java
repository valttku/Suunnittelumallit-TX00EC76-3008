public class Tomaattikastike extends Täytteet {

    private double hinta = 1.75;

    public Tomaattikastike(Pizza pizza) {
        super(pizza);
    }

    public double haeHinta() {
        return pizza.haeHinta() + hinta;
    }

    public String haeTiedot() {
        return pizza.haeTiedot() + ", tomaattikastike";
    }

}
