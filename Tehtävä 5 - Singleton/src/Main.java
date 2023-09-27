import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Käyttäjähallinta käyttäjähallinta = Käyttäjähallinta.getInstance();
        Käyttäjä käyttäjä = new Käyttäjä();
        Scanner scanner = new Scanner(System.in);

        System.out.println("* Kirjaudu sisään *");
        System.out.print("Anna salasana järjestelmään: ");
        String salasana = scanner.nextLine();

        käyttäjä.setSalasana(salasana);

        käyttäjähallinta.tarkistaSalasana(käyttäjä);

        scanner.close();
    }

}