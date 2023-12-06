public class Sekuntiviisari implements Cloneable {

    private int sekunti;

    public Sekuntiviisari() {}

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setSekunti(int sekunti) {
        this.sekunti = sekunti;
    }

    public int getSekunti() {
        return sekunti;
    }

    @Override
    public String toString() {
        return String.format("%02d", sekunti);
    }

}
