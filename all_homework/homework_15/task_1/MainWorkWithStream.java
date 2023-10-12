package all_homework.homework_15.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainWorkWithStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> listStream = list.stream();

        System.out.println(listStream.distinct().filter(x -> x % 2 == 0).mapToInt(Integer :: intValue).sum()); //task 1-3

        listStream.close();
    }
}
