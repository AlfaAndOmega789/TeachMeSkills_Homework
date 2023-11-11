package all_homework.homework_19.task_2;

import java.util.Arrays;

public class TestChoice {
    public static void main(String[] args) {
        int[]array = new int[10];
        int count = 0;

        for(int i = 9; 0 <= i;i--){
            array[count] = i;
            count++;
        }
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(sorted(array)));
    }

    public static int[] sorted(int[] array){
        for(int step =0; step < array.length;step++){
            int index = min(array, step);

            int someValue = array[step];
            array[step] = array[index];
            array[index]  = someValue;
        }

        return array;
    }

    public static int min(int[] array, int start){
        int minValue = start;
        int minIndex = array[start];
        for(int i = start + 1; i < array.length;i++){
            if(minValue > array[i]){
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
