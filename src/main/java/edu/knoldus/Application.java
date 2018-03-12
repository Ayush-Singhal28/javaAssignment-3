package edu.knoldus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        LocalDate birthdayDate = LocalDate.of(1995, 07, 28);
        System.out.println(Operation.getDayOfWeek(birthdayDate));

        String timeZone = "Asia/Kolkata";
        System.out.println(Operation.getCurrentTime(timeZone));

        LocalDateTime birthdayDateOfGandhi = LocalDateTime.of(1869, 10, 2, 0, 0);
        System.out.println(Operation.getNumOfSecLivedMahatmaGandhi(birthdayDateOfGandhi));

        Integer fromYear = 1990 ;
        System.out.println(Operation.getLeapYear(fromYear));


    }

}
