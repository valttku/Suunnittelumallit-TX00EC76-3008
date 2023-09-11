import java.util.ArrayList;

public class Emolevy implements Laiteosa {

    private double hinta;
    private ArrayList<Laiteosa> emolevyynLiitetytOsat = new ArrayList<>();

    public Emolevy(double hinta) {
        this.hinta = hinta;
    }

    public void lisääOsaEmolevyyn(Laiteosa laiteosa) {
        emolevyynLiitetytOsat.add(laiteosa);
    }

    public double haeLaiteosanHinta() {
        // Alustetaan hinta emolevyn hinnalla
        double kokonaishinta = hinta;
        // Käydään läpi kaikki emolevyyn liitettyjen osien hinnat ja lisätään ne kokonaishintaan
        for (Laiteosa laiteosa : emolevyynLiitetytOsat) {
            kokonaishinta += laiteosa.haeLaiteosanHinta();
        }
        return kokonaishinta;
    }
}