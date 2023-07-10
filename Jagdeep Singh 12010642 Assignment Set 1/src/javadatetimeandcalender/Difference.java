package javadatetimeandcalender;

import java.util.Calendar;
public class Difference {
    public static void main(String[] args) {
        int year1 = 2023;
        int year2 = 2024;
        // Get the number of days in each year
        int daysInYear1 = getDaysInYear(year1);
        int daysInYear2 = getDaysInYear(year2);
        // Get the number of days in the years between the two given years
        int daysBetweenYears = daysInYear2 - daysInYear1;
        // Print the number of days between the two given years
        System.out.println("There are " + daysBetweenYears + " days between " + year1 + " and " + year2);
    }
    private static int getDaysInYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.JULY, 24);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 30);
        return calendar.get(Calendar.DAY_OF_YEAR);
    }
}
