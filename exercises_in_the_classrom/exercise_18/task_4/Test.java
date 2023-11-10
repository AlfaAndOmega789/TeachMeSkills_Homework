package exercises_in_the_classrom.exercise_18.task_4;

import java.util.Arrays;

public class Test {
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
        int someValue = 0;

        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array.length;j++){
                if(array[i] < array[j]){
                    someValue = array[i];
                    array[i] = array[j];
                    array[j] = someValue;
                }
            }
        }
        return array;
    }
}
