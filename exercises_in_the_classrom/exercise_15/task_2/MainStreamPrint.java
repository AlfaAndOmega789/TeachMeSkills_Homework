package exercises_in_the_classrom.exercise_15.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainStreamPrint {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Minsk");
        list.add("London");
        list.add("Amsterdam");
        list.add("New York");
        list.add("Atlanta");
        list.add("Moscow");

        Stream stream = list.stream();
        stream.filter(x -> x.toString().charAt(0) == 'A').forEach(System.out :: println);

    }
}
