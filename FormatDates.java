package org.dates;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class FormatDates {
    public static void main(String[] args){
        LocalDateTime today = LocalDateTime.now();




        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
        String formattedDate = today.format(fmt);
        System.out.println(formattedDate);

        DateTimeFormatter fma =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDates = today.format(fma);
        System.out.println(formattedDates);

        DateTimeFormatter fmq =
                DateTimeFormatter.ofPattern("MMMM d,yyyy");
        String formattedDatess = today.format(fmq);
        System.out.println(formattedDatess);


        DateTimeFormatter fmp =
                DateTimeFormatter.ofPattern("EEEE, MMM d,yyyy hh:mm a");
        String formattedDateq = today.format(fmp);
        System.out.println(formattedDateq);

        DateTimeFormatter fmd =
                DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");
        String formattedDat = today.format(fmt);
        System.out.println(formattedDat);




    }

}
