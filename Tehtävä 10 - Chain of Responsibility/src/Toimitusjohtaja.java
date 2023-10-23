public class Toimitusjohtaja extends Palkankorotus {

    @Override
    public void processWageRise(double currentWage, double newWage) {
        double percent = ((newWage / currentWage) * 100) - 100;
        System.out.println("Pyytämäsi palkankorotus on " + String.format("%.2f", percent) + " prosenttia.\nToimitusjohtaja käsittelee palkankorotuksen.");
    }

}
