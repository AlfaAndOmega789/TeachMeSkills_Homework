package exercises_in_the_classrom.exercise_18.task_3;

public class ChildRunnable {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начинает свою работу");
        Child child = new Child();

        Thread thread1 = new Thread(child);
        Thread thread2 = new Thread(child);
        Thread thread3 = new Thread(child);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Поток main завершает свою работу");
    }
}

class Child implements Runnable{
    @Override
    public void run() {
        System.out.println("Побочный поток начинает свою работу");
    }
}
