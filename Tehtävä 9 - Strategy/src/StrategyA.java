import java.util.Iterator;
import java.util.List;

public class StrategyA implements ListConverter {

    @Override
    public String listToString(List<String> list) {

        StringBuilder builder = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            builder.append(it.next());
            // Tarkistetaan onko listassa seuraava elementti
            if (it.hasNext()) {
                // Rivinvaihtomerkin lisäys
                builder.append("\n");
            }
        }
        return builder.toString();
    }

}
