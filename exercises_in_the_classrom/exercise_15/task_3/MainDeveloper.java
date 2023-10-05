package exercises_in_the_classrom.exercise_15.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainDeveloper {
    public static void main(String[] args) {
        List<Developer> list = new ArrayList();
        list.add(new Developer(1, "Ivan"));
        list.add(new Developer(2, "Anton"));
        list.add(new Developer(3, "Petya"));

        list.stream().filter(x -> x.getId() > 10 &&
                x.getName().substring(0,1).equals("An")).forEach(System.out :: println);
    }
}
