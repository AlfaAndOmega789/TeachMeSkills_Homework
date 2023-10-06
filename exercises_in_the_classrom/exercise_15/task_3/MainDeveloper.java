package exercises_in_the_classrom.exercise_15.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainDeveloper {
    public static void main(String[] args) {
        List<Developer> list = new ArrayList();
        list.add(new Developer(10, "Ivan"));
        list.add(new Developer(20, "Anton"));
        list.add(new Developer(30, "Petya"));

        list.stream().filter(x -> x.getId() > 10 &&
                x.getName().substring(0,2).equals("An")).forEach(System.out :: println);

//        System.out.println(list.get(1).getName().substring(0,2));
    }
}
