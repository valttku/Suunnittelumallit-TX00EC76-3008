import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Luodaan proxykuvat ja lisätään ne listaan
        List<ProxyImage> imagefolder = new ArrayList<>();
        imagefolder.add(new ProxyImage("HiRes_10MB_Photo1"));
        imagefolder.add(new ProxyImage("HiRes_10MB_Photo2"));
        imagefolder.add(new ProxyImage("HiRes_10MB_Photo3"));
        imagefolder.add(new ProxyImage("HiRes_10MB_Photo4"));

        // Printataan kuvien tiedot
        for (ProxyImage image : imagefolder) {
            image.showData();
        }

        System.out.println("\nValokuva-albumissa on kuvia yhteensä " + imagefolder.size() + ".");

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nSelaa valokuvakansiota syöttämällä kuvaa vastaava luku: ");
            int input = scanner.nextInt();
            if (input >= 1 && input <= imagefolder.size()) {
                imagefolder.get(input - 1).displayImage();
            } else {
                System.out.println("Kuvaa ei löytynyt valokuvakansiosta.");
            }
        }

    }
}