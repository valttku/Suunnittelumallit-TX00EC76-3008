import java.util.List;

public class StrategyB implements ListConverter {

    @Override
    public String listToString(List<String> list) {

        StringBuilder builder = new StringBuilder();
        String[] names = new String[list.size()];

        // Listan muutos taulukoksi
        list.toArray(names);

        for (int i = 0; i < names.length; i++) {
            builder.append(names[i]);
            // Tarkistetaan onko taulukon indeksi parillinen ja ettei se ole viimeinen
            if (i % 2 == 1 && i < names.length - 1) {
                // Rivinvaihtomerkin lisäys
                builder.append("\n");
            }
        }
        return builder.toString();
    }

}
