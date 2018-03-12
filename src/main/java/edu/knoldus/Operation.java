package edu.knoldus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Operation {

    /**
     * list of day of week of birthday.
     *
     * @param @birthdayDate
     * @return list of day of week
     */
    public static List<String> getDayOfWeek(LocalDate birthdayDate) {
        List<LocalDate> dateList = new ArrayList<>();
        List<String> getDayOfWeekList = new ArrayList<>();
        dateList.add(birthdayDate);
        LocalDate today = LocalDate.now();
        int index = 0;
        while (dateList.get(index).getYear() <= today.getYear()) {
            getDayOfWeekList.add(dateList.get(index).getDayOfWeek().name());
            int year = dateList.get(index).getYear() + 1;
            dateList.add(LocalDate.of(year, birthdayDate.getMonth(), birthdayDate.getDayOfMonth()));
            index++;
        }
        return getDayOfWeekList;
    }

    /**
     * get zone date time of current time zone.
     *
     * @param @timeZone
     * @return get zone date time
     */
    public static ZonedDateTime getCurrentTime(String timeZone) {
        return ZonedDateTime.now(ZoneId.of(timeZone));
    }

    /**
     * get mahatma gandhi lived in seconds.
     *
     * @param @birthdayDateofGandhi
     * @return number of seconds lived
     */
    public static Long getNumOfSecLivedMahatmaGandhi(LocalDateTime birthdayDateOfGandhi) {
        LocalDateTime deathDateOfGandhi = LocalDateTime.of(1948, 1, 30, 0, 0);
        return ChronoUnit.SECONDS.between(birthdayDateOfGandhi, deathDateOfGandhi);
    }


    /**
     * list of leap year.
     *
     * @param @year
     * @return list of leap year
     */
    public static List<Integer> getLeapYear(Integer year) {


        List<Integer> yearList = new ArrayList<>();
        List<Integer> getLeapYearList = new ArrayList<>();
        yearList.add(year);
        LocalDate today = LocalDate.now();
        int index = 0;

        while (yearList.get(index) <= today.getYear()) {
            if (LocalDate.of(yearList.get(index), 1, 1).isLeapYear()) {
                getLeapYearList.add(yearList.get(index));
            }
            int newYear = yearList.get(index) + 1;
            yearList.add(newYear);
            index++;
        }
        return getLeapYearList;
    }
}
