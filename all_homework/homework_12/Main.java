package all_homework.homework_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Projects\\TeachMeSkills_Homework\\all_homework\\homework_12\\Romeo and Juliet.txt"));

        String stroka = reader.readLine();


        String[] array = stroka.split(" ");

        int maxLength = Integer.MIN_VALUE;
        int numberWorld = Integer.MIN_VALUE;

        for(int i = 0; i < array.length;i++){
            if(maxLength < array[i].length()){
                maxLength = array[i].length();
                numberWorld = i;
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(
                "C:\\Projects\\TeachMeSkills_Homework\\all_homework\\homework_12\\otherFile.txt"));
        writer.write(array[numberWorld]);

        reader.close();
        writer.close();
    }

}
