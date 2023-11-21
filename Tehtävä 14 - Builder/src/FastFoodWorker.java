public class FastFoodWorker {

    private Builder burgerBuilder;

    public void setBurgerBuilder(Builder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public void constructHesburgerBurger() {
        burgerBuilder.createBurger();
        burgerBuilder.buildTopBun();
        burgerBuilder.buildTomato();
        burgerBuilder.buildPatty();
        burgerBuilder.buildBottomBun();
    }

    public void constructMcDonaldsBurger() {
        burgerBuilder.createBurger();
        burgerBuilder.buildTopBun();
        burgerBuilder.buildPatty();
        burgerBuilder.buildTomato();
        burgerBuilder.buildBottomBun();
    }

}
