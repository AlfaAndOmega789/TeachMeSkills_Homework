package exercises_in_the_classrom.exercise_12.task_3;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private int course;

    public Student(String  name, int age, int course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

}
