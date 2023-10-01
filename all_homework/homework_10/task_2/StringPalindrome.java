package all_homework.homework_10.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        checkPalindrome("Anna is beautiful!", 2 - 1); // первый элемент в массиве начинается с 0, поэтому - 1 к заданному значению

        reader.close();
    }

    public static void checkPalindrome(String str, int i){

        if(i <= str.length()) {
            String[] array = str.toUpperCase().split(" ");
            StringBuffer buffer = new StringBuffer(array[i]);

            if(array[i].equals(buffer.reverse().toString())){
                System.out.println("Слово является палиндромом!");
            }
            else {
                System.out.println("Слово не является палиндромом!");
            }
        }
    }
}
