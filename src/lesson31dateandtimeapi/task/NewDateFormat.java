package lesson31dateandtimeapi.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class NewDateFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date format=> MM.yyyy get Last dey of the month of the year");
        String input = scanner.next();
        String date = calculateLastDay(input);
        System.out.println("Date: " + date);
    }

    public static String calculateLastDay(String dateInString) {
        if (Objects.nonNull(dateInString)) {
            SimpleDateFormat format = new SimpleDateFormat("MM.yyyy");
            SimpleDateFormat restFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = null;
            try {
                date = format.parse(dateInString);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
            return restFormat.format(calendar.getTime());
        }
        return "";
    }
}
