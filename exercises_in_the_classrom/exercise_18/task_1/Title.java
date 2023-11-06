package exercises_in_the_classrom.exercise_18.task_1;

public class Title {
    private String title;
    public Title(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                '}';
    }
}
