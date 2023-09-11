package all_homework.homework_7.task_2;

public class Triangle extends Figure{
    @Override
    public double square(double height, double base ){
        return 0.5 * height * base;
    }
    @Override
    public double perimeter(double height, double base) {
        return 2 * Math.sqrt(Math.pow(base, 2) - Math.pow(height, 2)) + 2 * height;
    }
}
