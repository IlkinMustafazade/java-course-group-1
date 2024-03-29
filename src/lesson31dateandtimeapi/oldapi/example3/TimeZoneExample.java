package lesson31dateandtimeapi.oldapi.example3;


import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneExample {
    public static void main(String[] args) {
        System.out.println("All available time zones");
        String[] timeZones = TimeZone.getAvailableIDs();
        System.out.println("Number ol of time zones: " + timeZones.length);
        for (String timezone : timeZones) {
            System.out.println(timezone);
        }
        System.out.println("\nDefault time zone:");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        System.out.println(defaultTimeZone.getID());
        System.out.println(defaultTimeZone.getDisplayName());
        Date date = new Date();
        System.out.println("Date: " + date);
        Locale locale = new Locale("aze");
        System.out.println(defaultTimeZone.getDisplayName(locale));
    }
}
