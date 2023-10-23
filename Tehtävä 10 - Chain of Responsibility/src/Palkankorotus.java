public abstract class Palkankorotus {

    private Palkankorotus successor;

    public void setSuccessor(Palkankorotus successor) {
        this.successor = successor;
    }

    public void processWageRise(double currentWage, double newWage) {
        if (successor != null) {
            successor.processWageRise(currentWage, newWage);
        }
    }

}
