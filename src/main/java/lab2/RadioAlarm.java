package lab2;

import lombok.Getter;

@Getter
public class RadioAlarm implements Alarm, Radio {

    @Override
    public void c() {
        System.out.println("RadioAlarm does c().");
    }

    @Override
    public void d() {
        System.out.println("RadioAlarm does d().");

    }

    @Override
    public void a() {
        System.out.println("RadioAlarm does a().");

    }

    @Override
    public void b() {
        System.out.println("RadioAlarm does b().");
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
    }
}
