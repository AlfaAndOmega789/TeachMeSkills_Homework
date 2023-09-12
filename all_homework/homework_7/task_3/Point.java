package all_homework.homework_7.task_3;

public class Point implements Cloneable{
    int x;
    int y;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // вызов метода clone() класса родителя - Object
    }
}
