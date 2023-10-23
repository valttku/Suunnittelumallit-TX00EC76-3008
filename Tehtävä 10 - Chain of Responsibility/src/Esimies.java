public class Esimies extends Palkankorotus {

    private final double allowedPercent = 2;

    @Override
    public void processWageRise(double currentWage, double newWage) {
        double percent = ((newWage / currentWage) * 100) - 100;
        // Esimies voi käsitellä maksimissaan 2% palkankorotukset
        if (percent <= allowedPercent) {
            System.out.println("Pyytämäsi palkankorotus on " + String.format("%.2f", percent) + " prosenttia.\nEsimies käsittelee palkankorotuksen.");
        } else {
            super.processWageRise(currentWage, newWage);
        }
    }
}
