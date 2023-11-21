import java.util.ArrayList;
import java.util.List;

public class McDonaldsBurger {

    List<Object> burger = new ArrayList<>();
    TopBun topBun = new TopBun("Ylin sämpylä");
    BottomBun bottomBun = new BottomBun("alin sämpylä.");
    Patty patty = new Patty("pihvi");
    Tomato tomato = new Tomato("tomaatti");

    public void setTopBun() {
        burger.add(topBun);
    }

    public void setBottomBun() {
        burger.add(bottomBun);
    }

    public void setPatty() {
        burger.add(patty);
    }

    public void setTomato() {
        burger.add(tomato);
    }

    public String toString() {
        return burger.toString();
    }

}
