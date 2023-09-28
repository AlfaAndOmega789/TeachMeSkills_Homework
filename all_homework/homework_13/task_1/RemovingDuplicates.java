package all_homework.homework_13.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemovingDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = reader.readLine().split(" ");
        List<String> list = new ArrayList<>();
        Collections.addAll(list, array);

        for(int i = 0; i < list.size(); i ++){
            for(int j = i + 1; j < list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(list.get(j));
                }
            }
        }
        String newString = "";

        for(int i = 0; i < list.size(); i++){
            newString += list.get(i) + " ";
        }
        newString = newString.substring(0, newString.length() - 1);
        System.out.println(newString);

    }
}
