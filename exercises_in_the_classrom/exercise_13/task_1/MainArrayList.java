package exercises_in_the_classrom.exercise_13.task_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> listCountry = new ArrayList<>(); //task 1.1
        listCountry.add("Belarus");
        listCountry.add("Poland");
        listCountry.add("USA");

        System.out.println(listCountry); //task 1.2
        listCountry.set(2 - 1, "Germany"); //task 1.3
        listCountry.remove(2 - 1); //task 1.4
        listCountry.remove("Belarus"); //task 1.5
        listCountry.indexOf("USA"); //taks 1.6
        listCountry.contains("Poland"); // task 1.7



    }
}
