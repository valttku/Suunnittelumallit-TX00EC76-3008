public class Käyttäjähallinta {

    private static Käyttäjähallinta instance;

    private Käyttäjähallinta() {}

    public static Käyttäjähallinta getInstance() {
        if (instance == null) {
            instance = new Käyttäjähallinta();
        }
        return instance;
    }

    public void tarkistaSalasana(Käyttäjä käyttäjä) {
        if (käyttäjä.getSalasana() != null && käyttäjä.getSalasana().equals("123")) {
            System.out.println("Salasana oikein, pääsy järjestelmään myönnetty.");
        } else {
            System.out.println("Salasana väärin, pääsy järjestelmään estetty.");
        }
    }

}
