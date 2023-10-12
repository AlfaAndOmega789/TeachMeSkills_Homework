package exercises_in_the_classrom.exercise_14.task_2;

import java.time.LocalDate;

public class NewWorkWithDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusWeeks(1));
    }
}
