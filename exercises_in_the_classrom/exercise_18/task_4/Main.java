package exercises_in_the_classrom.exercise_18.task_4;

public class Main{
    public static void main(String[] args) {
        System.out.println("Поток main начинает свою работу");
        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);

        Thread thread1 = new Thread(counterThread);
        Thread thread2 = new Thread(counterThread);
        Thread thread3 = new Thread(counterThread);
        Thread thread4 = new Thread(counterThread);
        Thread thread5 = new Thread(counterThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("Поток main завершает свою работу");
    }

}
class Counter {
    int count;

    public  void increase(){
        count++;
    }
    public void setCounter(int count) {
        this.count  = count ;
    }

    public int getCounter() {
        return count;
    }

}

class CounterThread implements Runnable{
    public Counter counter;
    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized(counter) {
            counter.setCounter(1);

            for (int i = 0; i < 4; i++) {
                System.out.println(counter.getCounter());
                counter.increase();
            }
        }
    }
}
