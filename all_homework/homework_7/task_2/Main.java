package all_homework.homework_7.task_2;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{new Triangle(), new Rectangle(), new Circle(), new Circle(), new Rectangle()};
        double sum = 0;

        for(int i = 0; i < figures.length;i++){
            sum += figures[i].perimeter(23, 12);
        }
    }
}
