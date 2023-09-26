package all_homework.homework_11;

public class WrongLoginException extends Exception{

    public WrongLoginException(){}
    public WrongLoginException(String description){
        super(description);
    }
}
