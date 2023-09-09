package all_homework.homework_2;


import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(firstTask(7.7,7.0)); //task 1
        System.out.println(secondTask(25)); // task 2
        System.out.println(thirdTask(128)); //task 3
        System.out.println(fourthTask(5.5424234234234141)); //task 4
        System.out.println(fifthTask(21, 8)); //task 5
        System.out.println(sixthTask(1, 2)); //task 6

        System.out.println("Результат сложения: " + seventhTaskAddition(sc.nextInt(), sc.nextInt())); //task 7.1
        System.out.println("Результат вычитания: " + seventhTaskSubtraction(sc.nextInt(), sc.nextInt())); // task 7.2
        System.out.println("Результат умножения: " + seventhTaskMultiplication(sc.nextInt(), sc.nextInt())); //task 7.3
        System.out.println("Результат деления: " + seventhTaskDivision(sc.nextInt(), sc.nextInt())); //task 7.4

        System.out.println(eighthTask(2, 4.0, 6.0)); //task 8
    }

    public static double firstTask(double b, double c){
        return 4*(b+c-1)/2;
    }
    public static int secondTask(long n){
        String stroka = n + "";
        char [] ch = stroka.toCharArray();
        return getNumericValue(ch[0]) + getNumericValue(ch[1]);
    }
    public static int thirdTask(long n){
        String stroka = n + "";
        char [] ch = stroka.toCharArray();

        int b = 0;

        for(int i = 0; i < ch.length; i++){
            b = b + getNumericValue(ch[i]);
        }

        return b;
    }

    public static long fourthTask(double n){
        return Math.round(n);
    }

    public static double fifthTask(int q, int w){
        return (double)q/w + (float)q%w; //  5/8 = 0.625
    }

    public static String sixthTask(int a, int b) {
        int c = 0;
        c = a;
        a = b;
        b = c;

        return a + " " + b;
    }

    public static double seventhTaskAddition(double a, double b){
        return a + b;
    }
    public static double seventhTaskSubtraction(double a, double b){
        return a  - b;
    }
    public static double seventhTaskMultiplication(double a, double b){
        return a * b;
    }
    public static double seventhTaskDivision(double a, double b){
        return (double)a / b + (double) a % b;
    }

    public static double eighthTask(int c, double a, double b){
        switch (c){
            case 1:
                 return seventhTaskAddition(a, b);
            case 2:
                return seventhTaskSubtraction(a, b);
            case 3:
                 return seventhTaskMultiplication(a, b);
            case 4:
                return seventhTaskDivision(a, b);

        }
        return 0;
    }




}
