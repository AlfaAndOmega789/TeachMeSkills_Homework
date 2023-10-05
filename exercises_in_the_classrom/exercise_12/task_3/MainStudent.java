package exercises_in_the_classrom.exercise_12.task_3;

import exercises_in_the_classrom.exercise_6.Person;

import java.io.*;

public class MainStudent {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "C:\\projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_12\\task_3\\person.txt"))) {
            Student student = new Student("Ivan", 24, 5);

            oos.writeObject(student);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_12\\task_3\\person.txt")))
        {
            Student st =(Student) ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", st.getName(), st.getAge());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
