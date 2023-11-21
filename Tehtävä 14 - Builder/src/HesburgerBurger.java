public class HesburgerBurger {

    private final StringBuilder stringBuilder = new StringBuilder();

    public void setTopBun() {
        stringBuilder.append("Ylin sämpylä, ");
    }

    public void setBottomBun() {
        stringBuilder.append("alin sämpylä.");
    }

    public void setPatty() {
        stringBuilder.append("pihvi, ");
    }

    public void setTomato() {
        stringBuilder.append("tomaatti, ");
    }

    public String toString() {
        return stringBuilder.toString();
    }

}
