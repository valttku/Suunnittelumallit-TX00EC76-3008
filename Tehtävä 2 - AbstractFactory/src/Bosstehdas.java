public class Bosstehdas implements Vaatetehdas {

    public Farmarit luoFarmarit() {
        return new BossinFarmarit();
    }

    public Kengät luoKengät() {
        return new BossinKengät();
    }

    public Lippis luoLippis() {
        return new BossinLippis();
    }

    public T_paita luoT_paita() {
        return new BossinT_paita();
    }

}
