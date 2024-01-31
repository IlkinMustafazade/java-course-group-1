package lesson31dateandtimeapi.newapi.example2;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdExample {
    public static void main(String[] args) {
        listZoneIds();

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Default zone ID: " + zoneId);

    }

    public static void listZoneIds(){
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        for (String zoneId:zoneIds){
            System.out.println("Zone Id: " + zoneId);
        }
        System.out.println();
    }
}
