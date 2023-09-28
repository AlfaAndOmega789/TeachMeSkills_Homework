package exercises_in_the_classrom.twelfth_exercise;

import java.io.*;

public class WorkWithStreams {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();

        FileOutputStream first = new FileOutputStream(
                "C:\\Projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\twelfth_exercise\\tws.txt");
        byte[] buffer = stroka.getBytes();

        first.write(buffer,0,buffer.length);

        FileOutputStream second = new FileOutputStream("C:\\Projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\twelfth_exercise\\tws.txt");

        char firstField = '_';
        char secondField = ' ';

        int i;

//        while(i = second.read() != -1){
//            if((char)i == )
//        }


    }
}
