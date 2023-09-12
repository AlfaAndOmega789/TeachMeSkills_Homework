package all_homework.homework_7.task_3;

public class NewPoint {
    int x;
    int y;

    public Object clone(){ //своя реализация метода clone()
        NewPoint newPoint = new NewPoint();
        newPoint.x = this.x;
        newPoint.y = this.y;

        return newPoint;
    }
}
