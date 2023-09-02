package exercises_in_the_classrom.third_exercise;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {4,1,1,2,7,8,10,2};

        month(sc.nextInt()); //task 1
        numbersFirst(); //task 2
        numberSecond(); // task 3
        twoMaxNumbers(number);//task 4
        System.out.println(compoundPercent(sc.nextDouble(),  sc.nextInt())); // task 5
        twoNumber(); // task 6
        naturalNumberTest(sc.nextInt()); //task 7
        outputMultiplicationTable(sc.nextInt(), sc.nextInt());//task 8
    }

    public static void month(int month){
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
    public static void numbersFirst(){
        int one = 1;
        while(true){
            if(one < 26)
                System.out.print(one++ + " ");
            else if( one == 26)
                break;
        }
        System.out.println();
    }

    public static void numberSecond(){
        for (int i = 0; i <= 20; i++) {
            if( i %2 == 0 && i > 10)
                System.out.print(i + " ");
        }
    }

    public static String compoundPercent(double sum, int month){
        double newSum = 0;
        newSum = sum  * 1.07;

        for(int i = 0; i < month - 1; i++){
            newSum = newSum * 1.07;
        }

        return Double.toString(newSum);
    }

    public static double twoNumber(){
        Scanner sc = new Scanner(System.in);
        double someSum = 0;
        int c;

        do{
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            someSum = firstNumber * secondNumber;
            System.out.println(someSum);
            System.out.println("Завершить работу?");
            c = sc.nextInt();
            if(c == 1)
                break;
        }while(true);

        return someSum;
    }

    public static void twoMaxNumbers(int[] number){

        int firstNumber = Integer.MIN_VALUE;
        int secondNumber = Integer.MIN_VALUE;

        for (int i = 1; i < number.length - 1; i++) {

            if(firstNumber < number[i + 1]){
                firstNumber = number[i + 1];

                if (secondNumber < firstNumber && secondNumber < number[i]){
                    secondNumber = number[i];
                }
            }
        }
        System.out.println(firstNumber + " , " + secondNumber);
    }

    public static void naturalNumberTest(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % 2 == 0){
                System.out.println("Число не является простым");
                break;
            }
        }
    }

    public static void outputMultiplicationTable(int firstNumber, int secondNumber){
        for (int i = 1; i <= firstNumber; i++){
            for(int j = 1; j <= secondNumber; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

}
