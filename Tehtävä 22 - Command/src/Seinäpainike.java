public class Seinäpainike {

    private Komento komento;

    public Seinäpainike(Komento komento) {
        this.komento = komento;
    }

    public void paina() {
        komento.suoritaKomento();
    }

}
