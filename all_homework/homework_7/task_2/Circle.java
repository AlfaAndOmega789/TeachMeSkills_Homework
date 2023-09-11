package all_homework.homework_7.task_2;

public class Circle extends Figure {


    @Override
    public double square(double n) {
        return 3.14 * Math.pow(n,2);
    }

    @Override
    public double square(double n, double m) {
        return square(n);
    }

    @Override
    public double perimeter(double n) {
        return 2 * 3.14  * n;
    }

    @Override
    public double perimeter(double n, double m) {
        return perimeter(n);
    }
}
