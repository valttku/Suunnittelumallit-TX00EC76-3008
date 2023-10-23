import java.util.ArrayList;
import java.util.List;

public class NameList {

    private List<String> list;
    private ListConverter listConverter;

    public NameList(ListConverter listConverter) {
        this.list = new ArrayList<>();
        this.listConverter = listConverter;
    }

    public void addName(String name) {
        list.add(name);
    }

    public void setStrategy(ListConverter listConverter) {
        this.listConverter = listConverter;
    }

    public void printList() {
        System.out.println(listConverter.listToString(list) + "\n");
    }

}
