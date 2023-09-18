package all_homework.homework_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class WorkingWithStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        String[] strings1 = new String[3];

        for (int i = 0; i < 3; i++) {
            strings1[i] = reader.readLine();
            strings.add(strings1[i]);

        }

        longestAndShortestString(strings); //task 1
        orderingString(strings1); //tsk 2

    }

    public static void longestAndShortestString(ArrayList<String> strings){ //task1, можно было сделать через Arrays.sort()
        if(strings.get(0).length() >= strings.get(1).length() && strings.get(0).length() >= strings.get(2).length()){
            System.out.println("Длинна самой длиннолй строки " + strings.get(0).length() + ", сама строка " + strings.get(0));
        }else if(strings.get(1).length() >= strings.get(2).length() && strings.get(1).length() >= strings.get(0).length()){
            System.out.println("Длинна самой длиннолй строки " + strings.get(1).length() + ", сама строка " + strings.get(1));
        }else if(strings.get(2).length() >= strings.get(0).length() && strings.get(2).length() >= strings.get(1).length()){
            System.out.println("Длинна самой длиннолй строки " + strings.get(2).length() + ", сама строка " + strings.get(2));
        }

        if(strings.get(0).length() <= strings.get(1).length() && strings.get(0).length() <= strings.get(2).length()){
            System.out.println("Длинна самой короткой строки " + strings.get(0).length() + ", сама строка " + strings.get(0));
        }else if(strings.get(1).length() <= strings.get(2).length() && strings.get(1).length() <= strings.get(0).length()){
            System.out.println("Длинна самой короткой строки " + strings.get(1).length() + ", сама строка " + strings.get(1));
        }else if(strings.get(2).length() <= strings.get(0).length() && strings.get(2).length() <= strings.get(1).length()){
            System.out.println("Длинна самой короткой строки " + strings.get(2).length() + ", сама строка " + strings.get(2));
        }
    }

    public static void orderingString(String[] strings){ //task 2
        String someString = "";

        for(int i = 0; i < strings.length; i++){
            for(int j = 1; j < strings.length - 1; j++){
                if(strings[i].length() > strings[i + 1].length()){
                    someString = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = someString;
                }
            }
        }

        for (int i = strings.length -1; 0 <= i; i--) {
            System.out.print(strings[i] + "," + strings[i].length() + "; ");
        }
    }

}
