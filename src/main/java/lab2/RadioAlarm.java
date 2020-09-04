package lab2;

import lombok.Getter;
import lombok.experimental.Delegate;

@Getter
public class RadioAlarm implements Alarm, Radio {

    @Delegate
    RadioImpl radio = new RadioImpl();
    @Delegate
    AlarmImpl alarm = new AlarmImpl();



    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
    }
}
