package exercises_in_the_classrom.ninth_exercise.task_1;

public class Square extends Shape{
    @Override
    void drow() {
        System.out.println("I draw " + Square.class.toString());
    }

    @Override
    void erase() {
        System.out.println("I erase " + Square.class.toString());

    }
}
