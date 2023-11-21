import java.time.LocalDate;
import java.time.temporal.IsoFields;


public class CalendarWeek {
    public static void main(String[] args) {
        System.out.println(getCalendarWeek("2017-01-01"));
    }

    public static int getCalendarWeek(String dateString) {
        return LocalDate.parse(dateString).get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);
    }
}
