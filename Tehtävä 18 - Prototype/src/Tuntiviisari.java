public class Tuntiviisari implements Cloneable {

    private int tunti;

    public Tuntiviisari() {}

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setTunti(int tunti) {
        this.tunti = tunti;
    }

    public int getTunti() {
        return tunti;
    }

    @Override
    public String toString() {
        return String.format("%02d", tunti);
    }

}
