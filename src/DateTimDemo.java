import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimDemo {
    public static void main(String[] args) {
        System.out.println("Current Time = " + LocalTime.now());
        System.out.println("Current Date = " + LocalDate.now()); // yyyy-mm-dd
        System.out.println("Current Time & Date = " + LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2022, Month.JULY,29);
        System.out.println("Date1 = "+date1);

        LocalDate date2 = LocalDate.of(2020, Month.MAY,10);
        System.out.println("Date2 = "+date2);

        System.out.println("Is '"+ date2 + "' a Leap Year = " +date2.isLeapYear());

        LocalTime time1 = LocalTime.of(20,0, 25, 2); // Hour range = 0-23 Minute,Seconds range = 0-59
        System.out.println("TIme = "+time1);

        LocalDateTime dt = LocalDateTime.of(date1,time1);
        System.out.println("DateTime = " + dt);

        System.out.println(date1.minusDays(10));
        System.out.println(date1); // date1 is immutable like String

        System.out.println(time1.plusMinutes(60));

        DateTimeFormatter shortF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Short Date time format of '" + dt + "' = " +shortF.format(dt)); // 29/7/22 8:00 PM
        System.out.println("Medium Date time format of '" + dt + "' = " +mediumF.format(dt)); // 29 Jul, 2022 8:00:25 PM

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dt.format(f));
    }

}
