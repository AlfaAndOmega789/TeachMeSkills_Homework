package exercises_in_the_classrom.third_exercise;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        month(sc.nextInt()); //task 1
        numbersFirst(); //task 2
        numberSecond(); // task 3
        System.out.println(compoundPercent(sc.nextDouble(),  sc.nextInt())); // task 4
        twoNumber(); // task 5

//        int[] num = {4,2,4,3,1,6,7};
//        twoMaxNumbers(num);
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

    public static double compoundPercent(double sum, int month){
        double newSum = 0;
        newSum = sum  * 1.07;

        for(int i = 0; i < month - 1; i++){
            newSum = newSum * 1.07;
        }

        return newSum;
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

//    public static void twoMaxNumbers(int[] number){
//
//        int firstNumber = number[0];
//        int secondNumber = number[1];
//
//        for (int i = 1; i < number.length; i++) {
//            if(firstNumber < number[i]) {
//                firstNumber = secondNumber;
//                if (secondNumber < firstNumber && secondNumber < number[i] ){ //доделать
//                    secondNumber = number[i];
//                }
//            }
//        }
//        System.out.println(secondNumber + " , " + firstNumber);
//    }

//    public static void star(int a){
//        for(int i = 0; i < a;i++){
//            for(int j = 0; j < i + 1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


}
