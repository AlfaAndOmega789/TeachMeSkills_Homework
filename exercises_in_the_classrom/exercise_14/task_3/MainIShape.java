package exercises_in_the_classrom.exercise_14.task_3;

public class MainIShape{
    public static void main(String[] args) {
        IShape triangleShape = (x, y) -> 0.5 * x * y;
        IShape rectangleShape = (x, y) -> x * y;

        double resultTriangle = triangleShape.getSquare(5,7);
        double resultRectangle = rectangleShape.getSquare(14,7);
    }

}
