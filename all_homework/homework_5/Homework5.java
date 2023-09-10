package all_homework.homework_5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(Arrays.deepToString(randomArray())); //task 1.1
//        System.out.println(Arrays.deepToString(addNumberToEachElementOfAnArray(sc.nextInt()))); // task 1.2
//        System.out.println(sumOfAllArrayElements(addNumberToEachElementOfAnArray(sc.nextInt()))); //task 1.3
//        for (int i = 0; i < chess().length; i++) { // task 2
//            for(int j = 0;j < chess().length;j++){
//                System.out.print(chess()[i][j] + " ");
//            }
//            System.out.println();
//        }
        snake(sc.nextInt(), sc.nextInt()); //task 3

    }

    public static int[][] randomArray(){ //task 1.1
        int randomArray[][] = new int[10][10];

        for(int i = 0; i < randomArray.length;i++){
            for(int j = 0; j < randomArray.length;j++){
                randomArray[i][j] = (int)(Math.random() * (200 + 1)) - 100;
            }
        }

        return randomArray;
    }
    public static int[][] addNumberToEachElementOfAnArray(int number){ //task 1.2
        int[][] randomArrayNew = randomArray();

        for(int i = 0 ; i < randomArrayNew.length;i++){
            for(int j = 0; j < randomArrayNew.length;j++){
                randomArrayNew[i][j] = randomArrayNew[i][j] + number;
            }
        }

        return randomArrayNew;
    }

    public static long sumOfAllArrayElements(int number[][]){ //task 1.3
        long sum = 0;

        for(int i = 0; i < number.length;i++){
            for(int j = 0; j < number.length; j++){
                sum += number[i][j];
            }
        }

        return sum;
    }

    public static String[][] chess(){ //tsk 2
        String [][] array = new String[8][8];

        for(int i = 0 ; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if((i + j) % 2 == 0){
                    array[i][j] = "W";
                }else{
                    array[i][j] = "B";
                }
            }
        }
        return array;
    }

    public static void snake(int n, int m){ //task 3

        int[][] arr = new int[n][m];

        for(int i = 0; i < n*m; i++) {
            int h = i / m;
            int j = h % 2 == 0 ? i % m : m - 1 - i % m;
            arr[i][j] = n;
        }

        System.out.println(Arrays.deepToString(arr));


    }
}
