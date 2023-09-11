package exercises_in_the_classrom.sixth_exercise;

public class Main {
    public static void main(String[] args) { //task 1.2
        Calculator calculator = new Calculator(12,10, "Black");
        calculator.sum(10, 2);
        calculator.difference(3, 4);
        calculator.division(5, 3);
        calculator.multiplication(45, 13);
        System.out.println(calculator.weight + " " + calculator.coast + " " + calculator.color);
        System.out.println(calculator.toString());
    }
}
