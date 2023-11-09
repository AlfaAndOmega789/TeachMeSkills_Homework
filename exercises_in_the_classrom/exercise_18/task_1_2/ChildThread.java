package exercises_in_the_classrom.exercise_18.task_1_2;

public class ChildThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начинает свою работу");
        Child child = new Child();
        child.start(); //task 1
        child.join(); // task 2
        System.out.println("Поток main завершает свою работу");
    }
}

class Child extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

}
