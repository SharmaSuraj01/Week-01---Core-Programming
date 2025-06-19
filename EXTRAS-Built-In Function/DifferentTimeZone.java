import java.time.*;
import java.time.format.DateTimeFormatter;

public class DifferentTimeZone {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Time in GMT : " + gmtTime.format(format));
        System.out.println("Time in IST: " + istTime.format(format));
        System.out.println("Time in PST: " + pstTime.format(format));

    }
}