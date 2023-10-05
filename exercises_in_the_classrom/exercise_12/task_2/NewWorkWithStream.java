package exercises_in_the_classrom.exercise_12.task_2;

import java.io.*;

public class NewWorkWithStream {
    public static void main(String[] args) throws IOException {
        String stroka = "Cognosce te ipsum";
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_12\\task_2\\tws2.txt");
        byte[] ch = stroka.getBytes();

        fileOutputStream.write( ch, 0, ch.length);

        FileInputStream inputStream = new FileInputStream("C:\\projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_12\\task_2\\tws2.txt");

        int i;

        System.out.println((char)inputStream.read());
    }
}
