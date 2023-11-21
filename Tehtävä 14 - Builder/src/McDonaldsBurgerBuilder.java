public class McDonaldsBurgerBuilder implements Builder {

    private McDonaldsBurger mcDonaldsBurger;

    @Override
    public void createBurger() {
        mcDonaldsBurger = new McDonaldsBurger();
    }

    @Override
    public void buildTopBun() {
        mcDonaldsBurger.setTopBun();
    }

    @Override
    public void buildBottomBun() {
        mcDonaldsBurger.setBottomBun();
    }

    @Override
    public void buildPatty() {
        mcDonaldsBurger.setPatty();
    }

    @Override
    public void buildTomato() {
        mcDonaldsBurger.setTomato();
    }

    @Override
    public McDonaldsBurger getBurger() {
        return mcDonaldsBurger;
    }

}
