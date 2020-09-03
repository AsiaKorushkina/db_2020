package date_time;

import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class MainTest {

    private Main m = new Main();
    @SneakyThrows
    @Test
    public void testConvert() {
        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
        Date date = m.convert(localDate);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateWithoutTime = sdf.parse(sdf.format(new Date()));
        Assert.assertEquals(date, dateWithoutTime);
    }

    @Test
    public void testTestConvert() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String s = "2020-12-12T12:12:12";
        Date d = formatter.parse(s, new ParsePosition(0));
        LocalDateTime localDateTime = m.convert(d);
        Assert.assertEquals(localDateTime, LocalDateTime.of(2020, 12, 12, 12,12,12));
    }

    @Test
    public void testDaysBetween() {
        String s1 = "2016/03/04&11:30";
        String s2 = "2016/03/06&11:30";
        int days = Main.daysBetween(s1, s2);
        int expected = 2;
        Assert.assertEquals(2, days);
    }
}