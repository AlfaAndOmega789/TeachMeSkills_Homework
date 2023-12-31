package all_homework.homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Задайте размер массива(натуральное, целое число): " );
        int someValue = sc.nextInt();
        int numbers[] = new int[someValue];

        for(int i = 0 ; i < someValue; i++){
            numbers[i] = (int)(Math.random() * 100);
            System.out.print(numbers[i] + " ");
        }

//        for(int i = 0; i < numbers.length; i++){ // цикл для заполнения массива вручную
//            numbers[i] = sc.nextInt();
//        }



        directAndReverseArrayOutput(numbers); //task 1
        minAndMaxValue(numbers); //task 2
        indexMinAndMaxValue(numbers); //task 3
        numberOfZeroElements(numbers); //task 4
        substitutionMethod(numbers); // task 5
        checkOfIncrease(numbers); //task 6
        addingOneToANumberFromAnArray(numbers); //task 7
    }


    public static void directAndReverseArrayOutput(int number[]){
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        for(int i = number.length - 1; i  >= 0; i--){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public static void minAndMaxValue(int number[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < number.length; i++){
            if(max < number[i])
                max = number[i];
            else if(min > number[i])
                    min = number[i];
        }

        System.out.println("Max: " + max + " Min: " + min);
    }

    public static void indexMinAndMaxValue(int number[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i < number.length; i++){
            if(max < number[i]) {
                max = number[i];
                maxIndex = i + 1;
            }
            else if(min > number[i]) {
                min = number[i];
                minIndex = i  + 1;
            }
        }

        System.out.println("MaxIndex: " + maxIndex + " Min: " + minIndex);
    }

    public static void numberOfZeroElements(int number[]){
        int numberOfZeroElements = 0;

        for(int i = 0; i < number.length; i++){
            if(number[i] == 0){
                ++numberOfZeroElements;
            }
        }

        if(numberOfZeroElements > 0)
            System.out.println("Количество нулевых элементов в массиве: " + numberOfZeroElements + "!");
        else{
                System.out.println("В массиве нет нулевых элементов!");
            }
    }

    public static void substitutionMethod(int number[]){

        int someValue = 0;
        for(int i = 0; i < number.length / 2; i++){
            someValue = number[i];
            number[i] = number[number.length - 1 - i];
            number[number.length - 1 - i] = someValue;
        }

        for (int i = 0; i < number.length ; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public static void checkOfIncrease(int number[]){
        boolean someValue = true;
        for(int i  = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]){
                someValue = false;
                break;
            }
        }
        System.out.println("Массив является возрастающим ? " + someValue);
    }

    public static void addingOneToANumberFromAnArray(int number[]){
        String stroka = "";

        for(int i = 0; i < number.length; i++){
            stroka = stroka + number[i];
        }

        Long value = Long.valueOf(stroka) + 1;
        String newStroka = Long.toString(value);
        char symbol [] = newStroka.toCharArray();

        System.out.println(Arrays.toString(symbol));
    }
}


