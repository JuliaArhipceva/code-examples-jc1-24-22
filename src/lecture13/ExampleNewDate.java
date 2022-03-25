package lecture13;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExampleNewDate {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println(now.minus(7, ChronoUnit.DAYS));
        System.out.println(now.plus(2, ChronoUnit.MINUTES));

        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, zoneId);
        System.out.println(localDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(now, zoneId);
        System.out.println(offsetDateTime);

        System.out.println(LocalDateTime.from(offsetDateTime));
//        System.out.println(OffsetDateTime.from(localDateTime));

        DateTimeFormatter isoOffsetDateTime =
                DateTimeFormatter.ISO_OFFSET_DATE_TIME;
//        System.out.println(isoOffsetDateTime.format(now));
        System.out.println(isoOffsetDateTime.format(offsetDateTime));

    }
}
