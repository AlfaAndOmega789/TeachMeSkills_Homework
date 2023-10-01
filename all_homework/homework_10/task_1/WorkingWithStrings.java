package all_homework.homework_10.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WorkingWithStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        String[] strings1 = new String[3];
        String stroka = "Hello";

        for (int i = 0; i < 3; i++) {
            strings1[i] = reader.readLine();
            strings.add(strings1[i]);
        }

//        longestAndShortestString(strings); //task 1
//        orderingString(strings1); //task 2
//        averageLength(strings1); //task 3
        uniqueCharacterInAWorld(strings1); //task 4
 //       System.out.println(dublicateSymbol(stroka));//task 5


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

         double average = (strings[0].length() + strings[1].length() + strings[2].length()) / 3;
            
         for(int i = 0; i < strings.length;i++){
             if(average > strings[i].length()){
                 System.out.println(strings[i] + "  " + strings[i].length());
             }
         }
         System.out.println();
    }
    public static void uniqueCharacterInAWorld(String[] array){ //task 4
        List<Character> firstWorld = new ArrayList<>();
        List<Character> secondWorld = new ArrayList<>();
        List<Character> thirdWorld = new ArrayList<>();
        char[] firstArray = array[0].toCharArray();
        char[] secondArray = array[1].toCharArray();
        char[] thirdArray = array[2].toCharArray();

        for(int i = 0; i < firstArray.length; i++){
            firstWorld.add(i, firstArray[i]);
        }
        for(int i = 0; i < secondArray.length; i++){
            secondWorld.add(i, secondArray[i]);
        }
        for(int i = 0; i < thirdArray.length; i++){
            thirdWorld.add(i, thirdArray[i]);
        }

        boolean someValue = true;

        first:
        if(someValue){
            for(int i = 0; i < firstWorld.size();i++){
                for(int j = i + 1; j < firstWorld.size();j++){
                    if(firstWorld.get(i) == firstWorld.get(j)){
                        System.out.println(array[0]);
                        someValue = false;
                        break first;
                    }
                }
            }
        }

        second:
        if(someValue){
            for(int i = 0; i < secondWorld.size();i++){
                for(int j = i + 1; j < secondWorld.size();j++){
                    if(secondWorld.get(i).equals(secondWorld.get(j))) {
                        System.out.println(array[0]);
                        someValue = false;
                        break second;
                    }
                }
            }
        }

        third:
        if(someValue){
            for(int i = 0; i < thirdWorld.size();i++){
                for(int j = i + 1; j < thirdWorld.size();j++){
                    if(thirdWorld.get(i).equals(thirdWorld.get(j))) {
                        System.out.println(array[2]);
                        someValue = false;
                        break third;
                    }
                }
            }
        }



    }
    public static String dublicateSymbol(String stroka){ //task 5
        char[] array = stroka.toCharArray();
        String newString = "";

        for(int i = 0; i < array.length;i++){
            newString += "" + array[i] + array[i];
        }

        return newString;
    }

}

