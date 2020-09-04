package lab2;

import lombok.Getter;

@Getter
public class RadioAlarm {
    private final Radio radio = new Radio();
    private final Alarm alarm = new Alarm();


    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.getRadio().a();
        radioAlarm.getAlarm().d();
    }
}
