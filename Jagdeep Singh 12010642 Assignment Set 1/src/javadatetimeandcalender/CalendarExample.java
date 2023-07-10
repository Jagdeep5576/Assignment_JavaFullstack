package javadatetimeandcalender;

import java.util.Calendar;
public class CalendarExample {
    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = Calendar.getInstance();
        // Get the year
        int year = calendar.get(Calendar.YEAR);
        // Get the month
        int month = calendar.get(Calendar.MONTH);
        // Get the day of the month
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        // Get the hour
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        // Get the minute
        int minute = calendar.get(Calendar.MINUTE);
        // Display the date and time
        System.out.println("The current date and time is:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
    }
}
