package lesson31dateandtimeapi.oldapi.example1;

import java.util.Date;

public class CurrenMillisecond {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        Date now = new Date();  // Output: current year - 1970
        System.out.println(now); // The current date will be printed
    }
}
