package all_homework.homework_7.task_2;

public class Rectangle extends  Figure{

    @Override
    public double square(double height, double base) {
        return height * base;
    }

    @Override
    public double perimeter(double n, double m) {
        return 2 * (n + m);
    }


}
