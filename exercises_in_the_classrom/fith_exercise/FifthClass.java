package exercises_in_the_classrom.fith_exercise;

import java.util.Random;
import java.util.Scanner;

public class FifthClass {
    public static void main(String[] args) {
        //newArray(); //task 1
        //System.out.println(jaggedArray()); // task 2
        //sumOfElementsOnTheMainDiagonal(); // task 3
        //outputArrayInReverseOrder(); // task 4
        outputArrayInReverseOrderNew(); // task 5
        //convertingEmptyElements();
    }

    public static void newArray() { //task 1
        double max = Double.MIN_VALUE;
        double[][] array = new double[3][3];

        for (int i = 0; i < array.length; i++) { //task 1.1
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Math.random();
            }
        }

        for (int i = 0; i < array.length; i++) { //task 1.1
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
    }

    public static int jaggedArray() { //task 2
        Scanner sc = new Scanner(System.in);
        double[][] array = new double[sc.nextInt()][];
        int numberOfCells = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = new double[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                numberOfCells++;
            }
        }
        return numberOfCells;
    }

    public static void sumOfElementsOnTheMainDiagonal() { //task 3
        Random random = new Random();
        int[][] array = new int[10][10];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt();

                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void outputArrayInReverseOrder() { //task 4
        int[][] array = new int[3][3];
        int number = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = number++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; 0 <= j; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void outputArrayInReverseOrderNew() { //task 5
        int[][] array = new int[3][3];
        int number = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = number++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void convertingEmptyElements() {

        char[] ch = new char[]{'c', ' ', 'a', ' '};


        int[] index = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
            }
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] != ' ') {

                } else {
                    ch[i] = '%';
                    ch[i + 1] = '2';
                    ch[i + 2] = '0';
                }
            }

//        char[] ch = new char[]{'c', ' ', 'a', ' '}; //first method
//        String str = new String(ch);
//        String stroka = str.replaceAll(" ", "%20");
//        char[] chNew = stroka.toCharArray();
//        System.out.println(stroka);
//        System.out.println(chNew);

        }
    }
}
