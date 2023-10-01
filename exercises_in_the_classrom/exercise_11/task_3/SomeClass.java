package exercises_in_the_classrom.exercise_11.task_3;

import java.io.IOException;

public class SomeClass {
    public static void main(String[] args) {
        firstMethod();
    }

    public static void firstMethod(){
        try {
            int i = 1/0;
        }catch (IncompatibleClassChangeError e){
            e.printStackTrace();
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Вызов finally");
        }
    }
    public static void secondMethod(){}
    public static void thirdMethod(){}
    public static void fourthMethod(){}
}
