public class Jasper {

    private Farmarit farmarit;
    private T_paita t_paita;
    private Lippis lippis;
    private Kengät kengät;

    // Vaatteiden luonti, Jasper saa parametrina joko Adidaksen tai Bossin vaatetehtaan
    public Jasper(Vaatetehdas vaatetehdas) {
        farmarit = vaatetehdas.luoFarmarit();
        t_paita = vaatetehdas.luoT_paita();
        lippis = vaatetehdas.luoLippis();
        kengät = vaatetehdas.luoKengät();
    }

    public void luetteleVaatteet() {
        System.out.println("Jasperilla on päällä " + farmarit + ", " + t_paita + ", " + lippis + " ja " + kengät + ".");
    }

}
