public class RullaaYlösKomento implements Komento {

    private Valkokangas valkokangas;

    public RullaaYlösKomento(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void suoritaKomento() {
        valkokangas.rullaaYlös();
    }

}
