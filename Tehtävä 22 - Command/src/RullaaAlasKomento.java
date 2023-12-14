public class RullaaAlasKomento implements Komento {

    private Valkokangas valkokangas;

    public RullaaAlasKomento(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void suoritaKomento() {
        valkokangas.rullaaAlas();
    }

}
