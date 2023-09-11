public class Main {

    public static void main(String[] args) {

        // Luodaan Adidastehdas
        Vaatetehdas adidas = new Adidastehdas();
        // Luodaan Jasper (vaatteet puetaan luonnin yhteydessä)
        Jasper koodaajaJasper = new Jasper(adidas);
        koodaajaJasper.luetteleVaatteet();

        System.out.println("Jasper valmistuu insinööriksi.");

        Vaatetehdas boss = new Bosstehdas();
        Jasper insinööriJapser = new Jasper(boss);
        insinööriJapser.luetteleVaatteet();

    }
}