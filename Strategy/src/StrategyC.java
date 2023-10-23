import java.util.List;

public class StrategyC implements ListConverter {

    @Override
    public String listToString(List<String> list) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i));
            // Tarkistetaan onko indeksi kahdella jaollinen ja ettei se ole viimeinen
            if ((i + 1) % 3 == 0 && i < list.size() - 1) {
                // Rivinvaihtomerkin lisäys
                builder.append("\n");
            }
        }
        return builder.toString();
    }

}
