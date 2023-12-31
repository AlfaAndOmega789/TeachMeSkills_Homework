package all_homework.homework_3;

import java.util.Scanner;

public class SomeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        evenNumber(sc.nextInt()); // task 1
        temperature(sc.nextInt()); //task 2
        squareNumber(); //task 3
        subsequence(); //task 4
        someMethod(10); //task 5
    }

    public static void evenNumber (int number){
        if(number % 2 == 0)
            System.out.println("Четное!");
        else
            System.out.println("Нечетное!");
    }

    public static void temperature(int t){
        if( t > -5)
            System.out.println("Warm");
        else if( -5 >= t && t > -20)
            System.out.println("Normal");
        else if(t <= -20)
            System.out.println("Cold");
    }

    public static void squareNumber(){
        for(int i = 10; i <= 20; i++){
            System.out.print((int)Math.pow(i, 2) + " ");
        }
        System.out.println();
    }

    public static void subsequence(){
        for(int i = 7; i <= 98; i+=7){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void someMethod(int number) {
        int sum = 0;

        if (number >= 1) {
            for (int i = 1; i < number; i++)
                sum = sum + i;
            System.out.println("Cумма составляет: " + sum);
        }
    }
}





