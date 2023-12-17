public class Memory {

    private char[] data;

    void load(long position, char[] data) {
        System.out.println("Muisti: Ladataan data osoitteeseen " + position);
        this.data = data;
    }

    void printData() {
        // Tulostetaan muistissa oleva data
        System.out.print("Muistin data: ");
        for (char value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
