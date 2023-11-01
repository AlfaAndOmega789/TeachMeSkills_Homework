package exercises_in_the_classrom.exercise_14.task_5;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> function = x ->{
            if(x > 0){
                return "Положительное число!";
            }else if(x < 0)
                return "Отрицательное число";
            else
                return "Ноль";
        };

        System.out.println(function.apply(10));
        System.out.println(function.apply(-1));
        System.out.println(function.apply(0));
    }
}
