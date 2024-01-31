package lesson31dateandtimeapi.newapi.example1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        System.out.println();

        System.out.println("Day of month: " + today.getDayOfMonth());
        System.out.println("Day of week: " + today.getDayOfWeek());
        System.out.println("Day of year: " + today.getDayOfYear());
        System.out.println();

        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println();

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println();

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Previous Month Same Day: " + previousMonthSameDay);
        System.out.println();

        LocalDate oneHundredYearAgoSameDay = LocalDate.now().minus(100, ChronoUnit.YEARS);
        System.out.println("One Hundred Years Ago Same day: " + oneHundredYearAgoSameDay);
        System.out.println("It is " + oneHundredYearAgoSameDay.getDayOfWeek());
        System.out.println();
    }
}
