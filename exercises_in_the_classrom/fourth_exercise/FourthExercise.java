package exercises_in_the_classrom.fourth_exercise;

import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
//        fiveRandomValue(); //task 1
//        arrayFruits(); // task 2
//        someMethod(); //task 3
//        System.out.println(arithmeticMean());//task 4
//        firstSomeMethod(); //task 5
        examplesForStudents(); //task 6(доделать)
//        insertAnElementAtTheSelectedPosition(); //task 7
//        flipArray();//task 8
//        sumOfPairedValuesInAnArray(); //task 9


    }

    public static void fiveRandomValue(){
        for (int i = 0; i < 5; i++) {
            System.out.print((int) Math.pow((int)(Math.random() * 100), 2) + " ");
        }
        System.out.println();
    }
    public static void arrayFruits(){
        String fruits[] = {"orange", "apple", "lemon", "watermelon"};
        System.out.println(fruits[1] + " " + fruits[2]);
        System.out.println(fruits.length);
        fruits[2] = "bananas";

        for(String str : fruits){
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void someMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        double[] masDouble = new double[sc.nextInt()];//task 3.1

        for (int i = 0; i < masDouble.length; i++) { //task 3.2
            masDouble[i] = Math.random();
            System.out.print(masDouble[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < masDouble.length; i++) {
            if(i % 2 == 0){
                masDouble[i] = Math.pow(masDouble[i], 2);//3.3.1
            }
            System.out.print(masDouble[i] + " ");//3.3.2
        }
        System.out.println();

        for(int i = masDouble.length - 1; 0 <= i;i--){ //3.3.3
            System.out.print(masDouble[i] + " ");
        }
    }

    public static  Double arithmeticMean(){
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[sc.nextInt()];
        double arithmeticMean = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
            arithmeticMean += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        return arithmeticMean / numbers.length + arithmeticMean %numbers.length;
    }

    public static void firstSomeMethod(){
        int number[] = new int[12];
        int max = Integer.MIN_VALUE;
        int indexElement = Integer.MIN_VALUE;

        for(int i = 0 ; i < number.length; i++){
            number[i] = (int)(Math.random() * (30  + 1)) - 15;
            System.out.print(number[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < number.length; i++){
            if(number[i] > max){
                max = number[i];
                indexElement = i;
            }
        }
        System.out.println(max);
        System.out.println(indexElement);

    }

    public static void insertAnElementAtTheSelectedPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int numbers[] = new int[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i;
        }
        System.out.println();

        System.out.println("Введите позицию элемента для вставки: ");
        int indexElement = sc.nextInt();

        System.out.println("Введите значение элемента который вы хотите подставить: ");
        numbers[indexElement] = sc.nextInt();

        System.out.println("Преобразованный массив:");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void examplesForStudents(){
        int numbers1[] = new int[15];
        int numbers2[] = new int[15];
        int multiplicationResult[] = new int[15];

        for(int i = 0 ; i < numbers1.length;i++){
            numbers1[i] = (int)(Math.random() * (7 + 1) + 2);

            System.out.print(numbers1[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < numbers1.length;i++){
            numbers2[i] = (int)(Math.random() * (7 + 1) + 2);
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();

        for(int i = 0 ; i < multiplicationResult.length; i++){
            multiplicationResult[i] = numbers1[i] * numbers2[i];
            System.out.print(multiplicationResult[i] + " ");
        }
    }

    public static void flipArray(){
        int someValue = 0;
        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < numbers.length /2; i++){
            someValue = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = someValue;
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void sumOfPairedValuesInAnArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте сумму элементов: ");
        int sum = sc.nextInt();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

        }

        for(int i = 0 ; i < numbers.length - 1; i++){
            for(int j = 1 ; j < numbers.length; j++){
                if((numbers[i] + numbers[j]) == sum){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }

    }

}
