public class iPhone {

    private USB_C cable;

    public iPhone(USB_C cable) {
        this.cable = cable;
    }

    public void chargeBattery() {
        cable.chargeBattery();
    }

}
