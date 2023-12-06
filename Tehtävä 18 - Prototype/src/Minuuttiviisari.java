public class Minuuttiviisari implements Cloneable {

    private int minuutti;

    public Minuuttiviisari() {}

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setMinuutti(int minuutti) {
        this.minuutti = minuutti;
    }

    public int getMinuutti() {
        return minuutti;
    }

    @Override
    public String toString() {
        return String.format("%02d", minuutti);
    }

}
