import java.time.LocalDateTime;
import java.util.Observable;

public class ClockTimer extends Observable {

    LocalDateTime now = LocalDateTime.now();
    int second = now.getSecond();
    int minute = now.getMinute();
    int hour = now.getHour();

    public int getSecond() {
        return second;
    };

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void tick() {

        second++;

        if (second == 60) {
            second = 0;
            minute++;
        }

        if (minute == 60) {
            minute = 0;
            hour++;
        }

        if (hour == 24) {
            hour = 0;
        }

        setChanged();
        notifyObservers();
    }
}