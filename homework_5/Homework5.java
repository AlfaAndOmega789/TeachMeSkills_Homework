package homework_5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(Arrays.deepToString(randomArray())); //task 1.1
//        System.out.println(Arrays.deepToString(addNumberToEachElementOfAnArray(sc.nextInt()))); // task 1.2
//        System.out.println(sumOfAllArrayElements(addNumberToEachElementOfAnArray(sc.nextInt()))); //task 1.3
        System.out.println(Arrays.deepToString(chess()));

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
        int randomArrayNew[][] = new int[randomArray().length][randomArray().length];

        for(int i = 0 ; i < randomArrayNew.length;i++){
            for(int j = 0; j < randomArrayNew.length;j++){
                randomArrayNew[i][j] = randomArray()[i][j] + number;
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

    public static String[][] chess(){
        String [][] array = new String[8][8];
        String str = "";
        int sum = 0;

        for(int i  = 0 ; i < Math.pow(array.length , 2) /2; i++){
            str += "W" +"B";
            System.out.println(str);
        }

        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array.length;j++){
                array[i][j] = "" + str.charAt(0 + sum);
                sum++;
            }
            sum++;
        }

        return array;
    }
}
