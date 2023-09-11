import java.util.ArrayList;

public class Kotelo implements Laiteosa {

    private double hinta;
    private ArrayList<Laiteosa> koteloonLiitetytOsat = new ArrayList<>();

    public Kotelo(double hinta) {
        this.hinta = hinta;
    }

    public void lisääOsaKoteloon(Laiteosa laiteosa) {
        koteloonLiitetytOsat.add(laiteosa);
    }

    public double haeLaiteosanHinta() {
        // Alustetaan hinta kotelon hinnalla
        double kokonaishinta = hinta;
        // Käydään läpi kaikki koteloon liitettyjen osien hinnat ja lisätään ne kokonaishintaan
        for (Laiteosa laiteosa : koteloonLiitetytOsat) {
            kokonaishinta += laiteosa.haeLaiteosanHinta();
        }
        return kokonaishinta;
    }
}
