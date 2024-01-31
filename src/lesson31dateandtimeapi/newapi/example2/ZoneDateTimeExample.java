package lesson31dateandtimeapi.newapi.example2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime nowInBaku = ZonedDateTime.now();
        System.out.println("Now in Baku: " + nowInBaku.getZone());
        System.out.println();

        ZonedDateTime nowInJapan = ZonedDateTime.now(ZoneId.of("Japan"));
        System.out.println("Now in Japan: " + nowInJapan);
        System.out.println();

        ZonedDateTime nowInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Now in Paris: " + nowInParis);
        System.out.println();
    }
}
