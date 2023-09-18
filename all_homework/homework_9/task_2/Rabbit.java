package all_homework.homework_9.task_2;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Ff-ff-ff");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Grass") ||food.equals("grass")){
            System.out.println("The rabbit loves to eat " + food);
        }else {
            System.out.println("The rabbit is unhappy");
        }
    }
}
