package all_homework.homework_19.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSorted {

    public static void main(String[] args) throws IOException {
        System.out.println("Поток main начинает свою работу");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(reader.readLine())];

        for(int i = 0; i < array.length;i++){

        }

        InsertSorted insertSorted = new InsertSorted(array);
        ChoiceSorted choiceSorted = new ChoiceSorted(array);
        BubbleSorted bubbleSorted = new BubbleSorted(array);

        Thread insertSortedThread = new Thread(insertSorted);
        Thread choiceSortedThread = new Thread(choiceSorted);
        Thread bubbleSortedThread = new Thread(bubbleSorted);

        insertSortedThread.start();
        choiceSortedThread.start();
        bubbleSortedThread.start();

//        System.out.println(insertSorted.sorted(array));
//        System.out.println(choiceSorted.sorted(array));
//        System.out.println(bubbleSorted.sorted(array));

        System.out.println("Поток main завершает свою работу");
    }
}

class InsertSorted implements Runnable{
    int[] array;
    public InsertSorted(int[] array){
        this.array = array;
    }
    @Override
    public void run() {
        sorted(array);
    }
    public int[] sorted(int[] array){
        return null;
    }
}

class ChoiceSorted implements Runnable{

    int[] array;
    public ChoiceSorted(int[] array){
        this.array = array;
    }
    @Override
    public void run() {
        sorted(array);
    }
    public int[] sorted(int[] array){
        return  null;
    }
}
class BubbleSorted implements Runnable{
    int[] array;
    public BubbleSorted(int[] array){
        this.array = array;
    }
    @Override
    public void run() {
        sorted(array);
    }

    public int[] sorted(int[] array){
        return  null;
    }
}

