package all_homework.homework_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "C:\\Projects\\TeachMeSkills_Homework\\all_homework\\homework_12\\romeo-and-juliet.txt"));

            String line = reader.readLine();
            while (line != null) {

                String[] array = line.split(" ");

                int maxLength = Integer.MIN_VALUE;
                int numberWorld = Integer.MIN_VALUE;

                for(int i = 0; i < array.length;i++){
                    if(maxLength < array[i].length()){
                        maxLength = array[i].length();
                        list.add(array[i]);
                    }
                }


                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        int countWord = 0;
        int lengthWord = 0;

        for(String str : list){
            if(lengthWord < str.length()){
                lengthWord = str.length();
                countWord = count;
            }
            count++;
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(
                "C:\\Projects\\TeachMeSkills_Homework\\all_homework\\homework_12\\otherFile.txt"));
        writer.write(list.get(countWord));

        writer.close();
    }

}
