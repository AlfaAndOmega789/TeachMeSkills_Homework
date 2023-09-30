package exercises_in_the_classrom.exercise_6;

public class Calculator { // task 1.1
    double weight,coast;
    String color;

     public Calculator(double weight, double coast, String color){ //task 1.3
         this.coast = coast;
         this.weight = weight;
         this.color = color;
     }

     public double sum(double number1 , double number2){
         return number1 + number2;
     }

     public double difference(double number1, double number2){
         return number1 - number2;
     }
    public double division(double number1, double number2){
        return number1 / number2 + number1 % number2;
    }
    public double multiplication(double number1, double number2){
        return number1 * number2;
    }
}
