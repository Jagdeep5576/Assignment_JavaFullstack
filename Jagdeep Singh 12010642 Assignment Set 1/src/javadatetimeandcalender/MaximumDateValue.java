package javadatetimeandcalender;

import java.util.Calendar;
public class MaximumDateValue {
    public static void main(String[] args) {
        // Get the current date
        Calendar calendar = Calendar.getInstance();
        // Get the maximum value of the year
        int year = calendar.getMaximum(Calendar.YEAR);
        // Get the maximum value of the month
        int month = calendar.getMaximum(Calendar.MONTH);
        // Get the maximum value of the week
        int week = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        // Get the maximum value of the date
        int date = calendar.getMaximum(Calendar.DATE);
        // Print the maximum values
        System.out.println("The maximum value of the year is " + year);
        System.out.println("The maximum value of the month is " + month);
        System.out.println("The maximum value of the week is " + week);
        System.out.println("The maximum value of the date is " + date);
    }
}
