package exercises_in_the_classrom.exercise_13.task_2;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<String> listCountry = new LinkedList<>(); // task 2.1
        listCountry.addFirst("Mexico");
        listCountry.addFirst("Canada");
        listCountry.addLast("France");
        listCountry.addLast("United Kindom");
        System.out.println(listCountry); // task 2.2
        listCountry.removeFirst();
        listCountry.removeLast(); // task 2.3
        listCountry.getFirst();
        listCountry.getLast(); // task 2.4


    }
}
