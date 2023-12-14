public class Main {

    public static void main(String[] args) {

        Valkokangas kangas = new Valkokangas();

        Komento rullaaYlösKomento = new RullaaYlösKomento(kangas);
        Komento rullaaAlasKomento = new RullaaAlasKomento(kangas);

        Seinäpainike painikeYlös = new Seinäpainike(rullaaYlösKomento);
        Seinäpainike painikeAlas = new Seinäpainike(rullaaAlasKomento);

        // Painetaan seinäpainikkeita
        painikeYlös.paina();
        painikeAlas.paina();

    }

}