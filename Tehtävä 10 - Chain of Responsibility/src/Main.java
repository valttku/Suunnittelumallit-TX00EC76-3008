import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Esimies esimies = new Esimies();
        Päällikkö päällikkö = new Päällikkö();
        Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();

        // Esimiehen yläpuolella on päällikkö
        esimies.setSuccessor(päällikkö);

        // Päällikön yläpuolella on toimitusjohtaja
        päällikkö.setSuccessor(toimitusjohtaja);

        System.out.print("Anna nykyinen palkkasi euroina: ");
        double currentWage = scanner.nextDouble();
        System.out.print("Kuinka paljon haluat lisää palkkaa? Anna uusi palkka euroina: ");
        double newWage = scanner.nextDouble();

        // Esimies käsittelee alustavasti palkankorotuksen
        esimies.processWageRise(currentWage, newWage);

    }

}