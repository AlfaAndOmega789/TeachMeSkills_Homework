package all_homework.homework_9.task_2;

public class Dog extends Animal{
    public Dog(){

    }

    @Override
    public void voice() {
        System.out.println("Gav-gav");
    }

    @Override
    public void eat(String food) {
        if(food.equals("bone") ||food.equals("Bone")){
            System.out.println("The dog loves to eat " + food);
        }else{
            System.out.println("The dog is unhappy");
        }

    }
}
