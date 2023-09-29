package all_homework.homework_13.task_3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public Student(){}


    private String name;
    private String group;
    private int course;
    private double grade;

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student(String name, String group, int course, double grade){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ivan Ivanov", "1", 1, 1.0));
        list.add(new Student("Alex Sidorov", "2", 2, 2.0));
        list.add(new Student("Mihail Petrov", "3", 3, 3.0));
        list.add(new Student("Valentin Shved", "4", 4, 4.0));
        list.add(new Student("Evgeny Mikhailov", "5", 5, 5.0));

        for(Student st : list){
            System.out.println(st.name);
        }
        System.out.println();

        Student student = new Student();
        student.studentExpelledOrTransferredToAnotherCourse(list);

        for(Student st : list){
            System.out.println(st.name);
        }
        System.out.println();

        student.printStudents(list, 3);

    }

    public void studentExpelledOrTransferredToAnotherCourse(List<Student> list){
        for(int i = 0; i < list.size();i++){
            if(3.0 > list.get(i).grade){
                list.remove(i);
            }else if(list.get(i).grade >= 3.0){
                list.get(i).course++;
            }
        }
    }

    public void printStudents(List<Student> list, int course){
        for(int i = 0; i < list.size();i++){
            if(list.get(i).course == course){
                System.out.println(list.get(i).name + " " + list.get(i).course);
            }
        }
    }
}
