package factorymethod;

public class Main {

    public static void main(String[] args) {

        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus rehtori = new Rehtori();
        AterioivaOtus oppilas = new Oppilas();

        opettaja.aterioi();
        rehtori.aterioi();
        oppilas.aterioi();
    }
}
