public class HardDrive {

    char[] read(long lba, int size) {
        char[] data = new char[size];
        for (int i = 0; i < size; i++) {
            // Oletetaan lba edustavan osoitetta ja lisätään se jokaiseen merkkiin
            data[i] = (char) ('A' + i + lba);
        }
        return data;
    }

}
