package all_homework.homework_19.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Поток main начинает свою работу");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(reader.readLine())];


        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        NewClassThread1 newClassThread1 = new NewClassThread1(array);
        NewClassThread2 newClassThread2 = new NewClassThread2(array);
        Thread thread1 = new Thread(newClassThread1);
        Thread thread2 = new Thread(newClassThread2);

        thread1.start();
        thread2.start();


        reader.close();
        System.out.println("Поток main завершает свою работу");
    }
}

class NewClassThread1 implements Runnable{

    int[] array;
    public NewClassThread1(int[] array){
        System.out.println(min(array));
    }
    @Override
    public void run() {
        min(array);
    }
    public int min(int[] array){
        int a = array[0];

        for(int i = 0 ; i < array.length;i++){
            if(a > array[i]){
                a = array[i];
            }
        }
        return a;
    }

}
class NewClassThread2 implements Runnable{

    int[] array;
    public NewClassThread2(int[] array){
        this.array = array;
    }
    @Override
    public void run() {
        System.out.println(max(array));
    }

    public int max(int[] array){
        int a = array[0];

        for(int i = 0 ; i < array.length;i++){
            if(a < array[i]){
                a = array[i];
            }
        }
        return a;
    }
}
