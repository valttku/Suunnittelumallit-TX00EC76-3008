public class Päällikkö extends Palkankorotus {

    private final double allowedPercent = 5;

    @Override
    public void processWageRise(double currentWage, double newWage) {
        double percent = ((newWage / currentWage) * 100) - 100;
        // Päällikkö voi käsitellä vain alle 5% palkankorotukset
        if (percent < allowedPercent) {
            System.out.println("Pyytämäsi palkankorotus on " + String.format("%.2f", percent) + " prosenttia.\nPäällikkö käsittelee palkankorotuksen.");
        } else {
            super.processWageRise(currentWage, newWage);
        }
    }

}
