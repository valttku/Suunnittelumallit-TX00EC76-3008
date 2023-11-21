public class Main {

    public static void main(String[] args) {

        Lightning cable = new Lightning();
        CableAdapter adapter = new CableAdapter(cable);
        iPhone myiPhone = new iPhone(adapter);

        myiPhone.chargeBattery();

    }

}