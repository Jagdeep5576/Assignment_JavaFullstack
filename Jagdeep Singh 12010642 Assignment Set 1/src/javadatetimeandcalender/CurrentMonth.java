package javadatetimeandcalender;

import java.time.*;

public class CurrentMonth {

    public static void main(String[] args) {

        // information about the month
        LocalDate ldt = LocalDate.of(2023, Month.JUNE, 24);
        Month mn = ldt.getMonth();
        int mnIntValue = mn.getValue();
        int minLength = mn.minLength();
        int maxLength = mn.maxLength();
        Month firstMonthOfQuarter = mn.firstMonthOfQuarter();
        System.out.println("\nInteger value of the current month: " + mnIntValue);
        System.out.println("Length of the month: " + minLength);
        System.out.println("Maximum length of the month: " + maxLength);
        System.out.println("First month of the Quarter: " + firstMonthOfQuarter+"\n");
    }
}

