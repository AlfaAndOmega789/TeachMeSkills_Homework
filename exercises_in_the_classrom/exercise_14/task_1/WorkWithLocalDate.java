package exercises_in_the_classrom.exercise_14.task_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkWithLocalDate {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("1998-07-12");
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
