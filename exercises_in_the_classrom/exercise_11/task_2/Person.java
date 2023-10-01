package exercises_in_the_classrom.exercise_11.task_2;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        createNewPerson(new Person(24, "Ivan"));

    }

    public static void createNewPerson(Person person){
        if(person.getAge() < 18){
            new NewException("Возраст меньше 18");
        }else{
            new NewException("Возраст больше 18");
        }
    }
}
