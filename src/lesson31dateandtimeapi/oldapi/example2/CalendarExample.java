package lesson31dateandtimeapi.oldapi.example2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarExample {
    public static void main(String[] args) {
        printCalendar();

    }

    public static void printCalendar() {
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Baku");
        System.out.println("Calendar in: " + timeZone.getDisplayName() + " time zone.");
        Calendar now = new GregorianCalendar(timeZone);
        now.setTimeZone(timeZone);
        System.out.println("ERA: " + now.get(Calendar.ERA));
        System.out.println("YEAR: " + now.get(Calendar.YEAR));
        System.out.println("MONTH: " + now.get(Calendar.MONTH));
        System.out.println("WEEK_OF_YEAR: " + now.get(Calendar.WEEK_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + now.get(Calendar.WEEK_OF_MONTH));
        System.out.println("DATE: " + now.get(Calendar.DATE));
        System.out.println("DAY_OF_YEAR: " + now.get(Calendar.DAY_OF_YEAR));
        System.out.println("DAY_OF_MONTH: " + now.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_WEEK: " + now.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_WEEK_IN_MONTH: " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("AM_PM: " + now.get(Calendar.AM_PM));
        System.out.println("HOUR: " + now.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + now.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + now.get(Calendar.MINUTE));
        System.out.println("SECOND: " + now.get(Calendar.SECOND));
        System.out.println("MILLISECOND: " + now.get(Calendar.MILLISECOND));
        System.out.println();

        System.out.println("Current time, with our reset");
        now.clear(Calendar.HOUR_OF_DAY);
        now.set(Calendar.HOUR, 8);
        System.out.println("HOUR: " + now.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + now.get(Calendar.HOUR_OF_DAY));
        System.out.println();

        System.out.println(now);
        Date date = now.getTime();
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleFormatter.format(date);
        System.out.println("Date: " + format);
    }
}
