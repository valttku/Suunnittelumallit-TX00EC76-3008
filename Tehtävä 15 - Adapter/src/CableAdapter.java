public class CableAdapter implements USB_C {

    private Lightning cable;

    public CableAdapter(Lightning cable) {
        this.cable = cable;
    }

    @Override
    public void chargeBattery() {
        cable.chargeUsingLightning();
    }

}
