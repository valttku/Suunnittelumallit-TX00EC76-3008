public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Kello alkuperainenKello = new Kello();
        Kello klooniKello = (Kello) alkuperainenKello.clone();

        // Tulostetaan alkuperäisen ja kloonin aika
        System.out.println("Alkuperäisen kellon aika: " + alkuperainenKello.getCurrentTime());
        System.out.println("Kloonikellon aika: " + klooniKello.getCurrentTime());

        // Muutetaan alkuperäisen kellon aikaa
        alkuperainenKello.updateClock();
        alkuperainenKello.updateClock();
        alkuperainenKello.updateClock();

        // Tulostetaan aika uudelleen
        System.out.println("Alkuperäisen kellon aika (päivityksen jälkeen): " + alkuperainenKello.getCurrentTime());
        System.out.println("Kloonikellon aika (päivityksen jälkeen): " + klooniKello.getCurrentTime());

    }

}