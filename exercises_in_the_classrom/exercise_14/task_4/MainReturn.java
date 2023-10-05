package exercises_in_the_classrom.exercise_14.task_4;

public class MainReturn {
    public static void main(String[] args) {
        ReturnInterface returnInterface = (a, b) -> {
            int someValue;
            if(a < b)
                someValue = a;
            else if(a > b)
                someValue = b;
            else
                someValue =0;
            return someValue;};

        System.out.println(returnInterface.returnSomeValue(2, 4));
    }

}
