package exercises_in_the_classrom.exercise_10.task_2;

public class MainStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello world!"); //task 2.1
        stringBuilder.append("xxxx"); //taks 2.2
        stringBuilder.setCharAt(5, 'y'); //task 2.3
        stringBuilder.delete(3, 6); //task 2.4
        stringBuilder.reverse(); //task 2.5
        String newString = stringBuilder.toString(); //task 2.6

        System.out.println(newString);
    }
}
