package exercises_in_the_classrom.exercise_14.task_6;

import java.util.function.Predicate;

public class NewMain {
    public static void main(String[] args) {
        Predicate<String> predicate = x ->{
            boolean someValue = false;

            if(x.substring(0, 1).equals("J") && x.substring(x.length() - 1, x.length()).equals("A")){
                someValue = true;
            }

            if(x.substring(0, 1).equals("N") && x.substring(x.length() - 1, x.length()).equals("A")){
                someValue = true;
            }

            return someValue;
        };

        System.out.println(predicate.test("JONA"));
        System.out.println(predicate.test("JON"));

        System.out.println(predicate.test("NOA"));
        System.out.println(predicate.test("NO"));

    }
}
