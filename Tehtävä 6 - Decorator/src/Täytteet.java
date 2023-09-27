public abstract class Täytteet implements Pizza {

    protected Pizza pizza;

    public Täytteet(Pizza pizza) {
        this.pizza = pizza;
    }

    public double haeHinta() {
        return pizza.haeHinta();
    }

    public String haeTiedot() {
        return pizza.haeTiedot();
    }

}
