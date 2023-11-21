public class HesburgerBurgerBuilder implements Builder {

    private HesburgerBurger hesburgerBurger;

    @Override
    public void createBurger() {
        hesburgerBurger = new HesburgerBurger();
    }

    @Override
    public void buildTopBun() {
        hesburgerBurger.setTopBun();
    }

    @Override
    public void buildBottomBun() {
        hesburgerBurger.setBottomBun();
    }

    @Override
    public void buildPatty() {
        hesburgerBurger.setPatty();
    }

    @Override
    public void buildTomato() {
        hesburgerBurger.setTomato();
    }

    @Override
    public HesburgerBurger getBurger() {
        return hesburgerBurger;
    }

}
