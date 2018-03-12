package edu.knoldus;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ApplicationTest {

    LocalDate birthdayDate = LocalDate.of(1995, 07, 28);
    String timeZone = "Asia/Kolkata";
    List<String> expecteddays = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "FRIDAY",
            "SATURDAY", "SUNDAY", "MONDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
            "THURSDAY", "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
    Long expectedlife = 2471731200L;
    Integer fromYear = 1990;
    List<Integer> expectedlist = Arrays.asList(1992, 1996, 2000, 2004, 2008, 2012, 2016);
    ZonedDateTime expectedtime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    LocalDateTime birthdayDateOfGandhi = LocalDateTime.of(1869, 10, 2, 0, 0);

    @Test
    public final void Test() {

        List<String> actualdays = Operation.getDayOfWeek(birthdayDate);
        List<Integer> actuallist = Operation.getLeapYear(fromYear);
        Long actuallife = Operation.getNumOfSecLivedMahatmaGandhi(birthdayDateOfGandhi);
        ZonedDateTime actualtime = Operation.getCurrentTime(timeZone);
        assertEquals("It should return list of days", expecteddays, actualdays);
        assertEquals("It should return List of Leap year", expectedlist, actuallist);
        assertEquals("It should return the life of Mahatma Gandhi in second", expectedlife, actuallife);
        assertEquals("It should return the time", expectedtime, actualtime);
    }

}
