package exercises_in_the_classrom.ninth_exercise.task_1;

public class Circle extends Shape{
    @Override
    void drow() {
        System.out.println("I draw " + Circle.class.toString());
    }

    @Override
    void erase() {
        System.out.println("I erase " + Circle.class.toString());

    }
}
