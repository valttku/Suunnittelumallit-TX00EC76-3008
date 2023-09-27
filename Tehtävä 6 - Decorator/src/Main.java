public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Meetvursti(new Juustoraaste(new Tomaattikastike(new Pohja())));
        System.out.println("Ensimmäisen pitsan ainekset: " + pizza1.haeTiedot() + ".");
        System.out.println("Ensimmäisen pitsan hinta: " + pizza1.haeHinta() + "€\n");

        Pizza pizza2 = new Seitan(new Juustoraaste(new Tomaattikastike(new Pohja())));
        System.out.println("Toisen pitsan ainekset: " + pizza2.haeTiedot() + ".");
        System.out.println("Toisen pitsan hinta: " + pizza2.haeHinta() + "€\n");

        Pizza pizza3 = new Herkkusieni(new Juustoraaste(new Tomaattikastike(new Pohja())));
        System.out.println("Kolmannen pitsan ainekset: " + pizza3.haeTiedot() + ".");
        System.out.println("Kolmannen pitsan hinta: " + pizza3.haeHinta() + "€");

    }
}