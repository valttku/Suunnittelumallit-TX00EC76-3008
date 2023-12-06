public class Kello implements Cloneable {

    private Tuntiviisari tunti;
    private Minuuttiviisari minuutti;
    private Sekuntiviisari sekunti;

    public Kello() {
        tunti = new Tuntiviisari();
        minuutti = new Minuuttiviisari();
        sekunti = new Sekuntiviisari();
        resetClock();
    }

    public void resetClock() {
        tunti.setTunti(0);
        minuutti.setMinuutti(0);
        sekunti.setSekunti(0);
    }

    private void incrementTime() {
        sekunti.setSekunti(sekunti.getSekunti() + 1);
        if (sekunti.getSekunti() == 60) {
            sekunti.setSekunti(0);
            minuutti.setMinuutti(minuutti.getMinuutti() + 1);
            if (minuutti.getMinuutti() == 60) {
                minuutti.setMinuutti(0);
                tunti.setTunti(tunti.getTunti() + 1);
                if (tunti.getTunti() == 24) {
                    resetClock();
                }
            }
        }
    }

    public void updateClock() {
        incrementTime();
        System.out.println(getCurrentTime());
    }

    public String getCurrentTime() {
        return tunti.toString() + ":" + minuutti.toString() + ":" + sekunti.toString();
    }

    // SYVÄKOPIONTI
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Kello clonedKello = (Kello) super.clone();
        clonedKello.tunti = (Tuntiviisari) tunti.clone();
        clonedKello.minuutti = (Minuuttiviisari) minuutti.clone();
        clonedKello.sekunti = (Sekuntiviisari) sekunti.clone();
        return clonedKello;
    }

    // MATALAKOPIOINTI
    /*
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    */

}
