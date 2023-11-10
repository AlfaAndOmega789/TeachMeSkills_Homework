package all_homework.homework_19.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class MainSorted {
    public static void main(String[] args) throws IOException {
        System.out.println("Поток main начинает свою работу");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(reader.readLine())];
        Random random = new Random();

        for(int i = 0; i < array.length;i++){
            array[i] = random.nextInt(10 + 1);
        }
        System.out.println("Generate array - " + Arrays.toString(array));

        InsertSorted insertSorted = new InsertSorted(array.clone());
        ChoiceSorted choiceSorted = new ChoiceSorted(array.clone());
        BubbleSorted bubbleSorted = new BubbleSorted(array.clone());

        Thread choiceSortedThread = new Thread(choiceSorted);
        Thread bubbleSortedThread = new Thread(bubbleSorted);
        Thread insertSortedThread = new Thread(insertSorted);

        insertSortedThread.start();
        choiceSortedThread.start();
        bubbleSortedThread.start();

        System.out.println("Поток main завершает свою работу");

        reader.close();
    }
}

class InsertSorted implements Runnable{
    int[] array;
    public InsertSorted(int[] array){
        this.array = array;
    }
    @Override
    public void run() {

        System.out.println("InsertSorted - " + Arrays.toString(sorted(array)));
    }
    public static int[] sorted(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int someValue = array[i];
            int j = i;

            while (j > 0 && array[j - 1] > someValue) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = someValue;
        }

        return array;
    }
}

class ChoiceSorted implements Runnable{

    int[] array;
    public ChoiceSorted(int[] array){
        this.array = array;
    }
    @Override
    public void run() {
        System.out.println("ChoiceSorted - " + Arrays.toString(sorted(array)));
    }
    public static int[] sorted(int[] array){
        return  array;
    }
}
class BubbleSorted implements Runnable{
    int[] array;
    public BubbleSorted(int[] array){
        this.array = array;
    }
    @Override
    public void run() {

        System.out.println("BubbleSorted - " + Arrays.toString(sorted(array)));

    }

    public static int[] sorted(int[] array){
            int someValue = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        someValue = array[i];
                        array[i] = array[j];
                        array[j] = someValue;
                    }
                }
            }

        return  array;
    }
}

