public class Adidastehdas implements Vaatetehdas {

    public Farmarit luoFarmarit() {
        return new AdidaksenFarmarit();
    }

    public Kengät luoKengät() {
        return new AdidaksenKengät();
    }

    public Lippis luoLippis() {
        return new AdidaksenLippis();
    }

    public T_paita luoT_paita() {
        return new AdidaksenT_paita();
    }
}
