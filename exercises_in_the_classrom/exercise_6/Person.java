package exercises_in_the_classrom.exercise_6;

public class Person {
    String fullName = "Ivan";
    int age;

    public Person(){}
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(String text){
        System.out.println(fullName + " talk *text*..." + fullName  + " walk.");
    }
    public void move(){}
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Ivan", 24);
    }

}
