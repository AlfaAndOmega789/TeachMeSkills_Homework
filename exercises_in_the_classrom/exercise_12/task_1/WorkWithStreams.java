package exercises_in_the_classrom.exercise_12.task_1;

import java.io.*;

public class WorkWithStreams {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();

        FileOutputStream first = new FileOutputStream("C:\\projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_12\\tws.txt");
        byte[] buffer = stroka.getBytes();

        first.write(buffer,0,buffer.length);

        FileInputStream  second = new FileInputStream ("C:\\projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_12\\tws.txt");

        char firstField = '_';
        char secondField = ' ';

        int i;

        while((i = second.read()) != -1){
            if((char)i == secondField){
                i = firstField;
            }
            System.out.print((char)i);
        }
    }
}
