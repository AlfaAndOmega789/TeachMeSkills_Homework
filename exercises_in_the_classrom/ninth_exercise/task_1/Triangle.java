package exercises_in_the_classrom.ninth_exercise.task_1;

public class Triangle extends Shape{
    @Override
    void drow() {
        System.out.println("I draw " + Triangle.class.toString());
    }

    @Override
    void erase() {
        System.out.println("I erase " + Triangle.class.toString());

    }
}
