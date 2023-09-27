public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Luodaan kello
        ClockTimer clockTimer = new ClockTimer();

        // Lisätään clockTimerille tarkkailija (tapahtuu digitalClockin konstruktorissa)
        DigitalClock digitalClock = new DigitalClock(clockTimer);

        // Laitetaan kello tikittämään joka 1000ms
        while (true) {
            clockTimer.tick();
            Thread.sleep(1000);
        }

    }
}