public class Main {

    public static void main(String[] args) {

        // Luodaan lista ja asetetaan sille strategia A
        NameList list = new NameList(new StrategyA());

        // Lisätään nimet listaan
        list.addName("Valdo");
        list.addName("Jessika");
        list.addName("Ilona");
        list.addName("Ilmari");
        list.addName("Jorma");
        list.addName("Laura");
        list.addName("Kalle");
        list.addName("Marika");

        // Tulostetaan lista
        list.printList();

        // Vaihdetaan strategiaa B:hen ja tulostetaan lista
        list.setStrategy(new StrategyB());
        list.printList();

        // Vaihdetaan strategiaa C:hen ja tulostetaan lista
        list.setStrategy(new StrategyC());
        list.printList();

    }
}