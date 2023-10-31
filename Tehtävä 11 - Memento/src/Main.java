public class Main {

    public static void main(String[] args) throws InterruptedException {

        Arvuuttaja arvuuttaja = new Arvuuttaja();

        // Luodaan taulukot 3 pelaajalle ja säikeelle
        Pelaaja[] pelaajat = new Pelaaja[3];
        Thread[] pelaajaSäikeet = new Thread[3];

        // Luodaan pelaajat ja säikeet
        for (int i = 0; i < 3; i++) {
            pelaajat[i] = new Pelaaja(arvuuttaja, i+1);
            pelaajaSäikeet[i] = new Thread(pelaajat[i]);
            // Käynnistetään säikeet
            pelaajaSäikeet[i].start();
        }

        for (Thread pelaajaSäie : pelaajaSäikeet) {
            pelaajaSäie.join();
        }

    }

}