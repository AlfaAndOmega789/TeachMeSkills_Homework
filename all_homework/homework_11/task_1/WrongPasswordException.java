package all_homework.homework_11.task_1;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){}
    public WrongPasswordException(String description) {
        super(description);
    }

}
