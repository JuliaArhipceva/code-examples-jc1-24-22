package lecture13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleDate {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        System.out.println(new Date(122, 26, 4, 22, 33, 44));

        System.out.println(new Date(1648236284000L));
        System.out.println(new Date().getTime());
        System.out.println(new Date(999999999999999999L));

        DateFormat dateFormat1 = new SimpleDateFormat("E d-M-y h:m a");
        System.out.println(dateFormat1.format(date));
        DateFormat dateFormat2 = new SimpleDateFormat("EE dd-MM-yy hh:mm aa");
        System.out.println(dateFormat2.format(date));
        DateFormat dateFormat3 = new SimpleDateFormat("EEE ddd MMM yyy hhh:mmm aaa");
        System.out.println(dateFormat3.format(date));
        DateFormat dateFormat4 = new SimpleDateFormat("EEEE dddd MMMM yyyy hhhh:mmmm aaaa");
        System.out.println(dateFormat4.format(date));

        String strDate = "пт 25-3-2022 7:45 PM";
        Date parsedDate = dateFormat1.parse(strDate);
        System.out.println(parsedDate);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        calendar.set(Calendar.DAY_OF_WEEK, 4);
        Date dateFromCalendar = calendar.getTime();
        System.out.println(dateFromCalendar);
    }
}
