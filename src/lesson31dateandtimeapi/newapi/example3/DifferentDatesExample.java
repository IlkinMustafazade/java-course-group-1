package lesson31dateandtimeapi.newapi.example3;

import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;

public class DifferentDatesExample {
    public static void main(String[] args) {
        HijrahDate hijrahDate = HijrahDate.now();
        System.out.println(hijrahDate);

        JapaneseDate japaneseDate = JapaneseDate.now();
        System.out.println(japaneseDate);

        ThaiBuddhistDate thaiBuddhistDate = ThaiBuddhistDate.now();
        System.out.println(thaiBuddhistDate);
    }
}
