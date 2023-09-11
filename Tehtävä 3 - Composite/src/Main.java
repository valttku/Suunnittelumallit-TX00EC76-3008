public class Main {

    public static void main(String[] args) {

        // Luodaan kaikki tietokoneeseen vaadittavat osat ja asetetaan niille hinnat
        Kotelo kotelo = new Kotelo(129.90);
        Emolevy emolevy = new Emolevy(159.90);
        Muistipiiri muistipiiri = new Muistipiiri(139.90);
        Näytönohjain näytönohjain = new Näytönohjain(789.90);
        Prosessori prosessori = new Prosessori(449.90);
        Verkkokortti verkkokortti = new Verkkokortti(29.99);
        Virtalähde virtalähde = new Virtalähde(174.90);

        // Aloitetaan tietokoneen rakentaminen kokoamalla emolevy
        emolevy.lisääOsaEmolevyyn(muistipiiri);
        emolevy.lisääOsaEmolevyyn(näytönohjain);
        emolevy.lisääOsaEmolevyyn(prosessori);
        emolevy.lisääOsaEmolevyyn(verkkokortti);

        // Kootaan kotelo
        kotelo.lisääOsaKoteloon(virtalähde);

        // Tulostetaan tietokoneen kokonaishinta (en tehnyt tietokoneen kokoamiselle omaa luokkaa, vaikka olisi voinut)
        System.out.println("Tietokoneen kokonaishinta on " + String.format("%.2f", emolevy.haeLaiteosanHinta() + kotelo.haeLaiteosanHinta()) + "€");

    }

}