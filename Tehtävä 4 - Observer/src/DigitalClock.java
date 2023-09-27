import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private ClockTimer clockTimer;

    public DigitalClock(ClockTimer clockTimer) {
        this.clockTimer = clockTimer;
        this.clockTimer.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof ClockTimer) {
            draw();
        }
    }

    private void draw() {

        int second = clockTimer.getSecond();
        int minute = clockTimer.getMinute();
        int hour = clockTimer.getHour();

        String secondString, minuteString, hourString;

        if (second < 10) {
            secondString = "0" + second;
        } else {
            secondString = Integer.toString(second);
        }

        if (minute < 10) {
            minuteString = "0" + minute;
        } else {
            minuteString = Integer.toString(minute);
        }

        if (hour < 10) {
            hourString = "0" + hour;
        } else {
            hourString = Integer.toString(hour);
        }

        System.out.println(hourString + ":" + minuteString + ":" + secondString);
    }

}
