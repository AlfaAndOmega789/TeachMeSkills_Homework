package all_homework.homework_9.task_1;

public class Tiger extends Animal {

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Meat") ||food.equals("meat")){
            System.out.println("The tiger loves to eat " + food);
        }else {
            System.out.println("The tiger is unhappy");
        }
    }
}
