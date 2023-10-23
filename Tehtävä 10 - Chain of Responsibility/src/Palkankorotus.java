public abstract class Palkankorotus {

    private Palkankorotus successor;

    public void setSuccessor(Palkankorotus successor) {
        this.successor = successor;
    }

    public void processWageRise(double oldWage, double newWage) {
        if (successor != null) {
            successor.processWageRise(oldWage, newWage);
        }
    }

}
