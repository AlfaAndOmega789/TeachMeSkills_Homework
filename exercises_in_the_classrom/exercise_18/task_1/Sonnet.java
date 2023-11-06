package exercises_in_the_classrom.exercise_18.task_1;

import java.util.List;

public class Sonnet {
    private List<Author> authors;
    private String title;
    private String lines;

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public String getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "authors=" + authors +
                ", title='" + title + '\'' +
                ", lines='" + lines + '\'' +
                '}';
    }
}
