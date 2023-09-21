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
        orderingString(strings1); //task 2
        averageLength(strings1); //task 3

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

        for(int i = 0; i < strings.length - 1; i++){

                if(strings[i].length() > strings[i + 1].length()){
                    someString = strings[i];
                    strings[i] = strings[i  + 1];
                    strings[i + 1] = someString;
                }
            }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
     }

     public static void averageLength(String[] strings){ // task 3
         String someString = "";

         for(int i = 0; i < strings.length - 1; i++){

             if(strings[i].length() > strings[i + 1].length()){
                 someString = strings[i];
                 strings[i] = strings[i  + 1];
                 strings[i + 1] = someString;
             }
         }

         double average = (strings[0].length() + strings[1].length() + strings[2].length()) / 3 + (strings[0].length() + strings[1].length() + strings[2].length()) % 3 ;
            
         for(int i = 0; i < strings.length;i++){
             if(average > strings[i].length()){
                 System.out.println(strings[i] + "  " + strings[i].length());
             }
         }
         System.out.println();

//        int average = Integer.MIN_VALUE;
//
//        if(strings[0].length() >= strings[1].length() && strings[2].length() >= strings[0].length()  ){
//            average = strings[0].length();
//        } else if(strings[1].length() >= strings[0].length() && strings[0].length() >= strings[2].length()  ){
//             average = strings[0].length();
//        } else if(strings[2].length() >= strings[1].length() && strings[1].length() >= strings[0].length()  ){
//            average = strings[1].length();
//        }else if(strings[1].length() >= strings[2].length() && strings[0].length() >= strings[1].length()  ){
//            average = strings[1].length();
//        }else if(strings[1].length() >= strings[2].length() && strings[2].length() >= strings[0].length()  ){
//            average = strings[2].length();
//        }else if(strings[2].length() >= strings[1].length() && strings[0].length() >= strings[2].length()  ){
//            average = strings[2].length();
//        }
    }

}

