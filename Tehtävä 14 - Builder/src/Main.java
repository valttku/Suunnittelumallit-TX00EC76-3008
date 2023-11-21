public class Main {

    public static void main(String[] args) {

        FastFoodWorker worker = new FastFoodWorker();

        HesburgerBurgerBuilder builder = new HesburgerBurgerBuilder();

        worker.setBurgerBuilder(builder);
        worker.constructHesburgerBurger();

        HesburgerBurger hesburgerBurger = builder.getBurger();
        System.out.println(hesburgerBurger);

        McDonaldsBurgerBuilder builder2 = new McDonaldsBurgerBuilder();

        worker.setBurgerBuilder(builder2);
        worker.constructMcDonaldsBurger();

        McDonaldsBurger mcDonaldsBurger = builder2.getBurger();
        System.out.println(mcDonaldsBurger);

    }

}