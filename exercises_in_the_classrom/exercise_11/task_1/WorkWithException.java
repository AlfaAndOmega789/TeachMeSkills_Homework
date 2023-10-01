package exercises_in_the_classrom.exercise_11.task_1;

public class WorkWithException {

    public static void main(String[] args) {
            try{ //task 1.2
            methodArrayIndexOutOfBoundException();
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }catch (Exception e){ //task 1.3
                e.printStackTrace();
            }

    }

    public static void methodArrayIndexOutOfBoundException() throws ArrayIndexOutOfBoundsException{ // task 1.1
        int[] array = new int[3];

        for(int i = 0; i < array.length + 1;i++){
            array[i] = i;
        }
    }
}
