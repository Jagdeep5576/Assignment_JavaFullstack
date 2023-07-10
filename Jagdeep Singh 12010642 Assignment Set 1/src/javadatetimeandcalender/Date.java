package javadatetimeandcalender;

import java.util.Calendar;
public class Date {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // Set year, month and date
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DATE, 24);
        // util date object
        java.util.Date dt = calendar.getTime();
        System.out.println("Date: "+dt);
    }
}
