package all_homework.homework_11.task_1;

public class AnalysisExeption {
    public static boolean threeParametrs(String login, String password, String confimPassword) throws WrongPasswordException, WrongLoginException {
        boolean result = true;

        if (login.length() > 20 || login.indexOf(" ") != -1) {
            result = false;
            throw new WrongLoginException("Login не соответствует заданному условию!");

        }
        if(password.length() > 20 || password.indexOf(" ") == -1 || password.equals(confimPassword) || checkNumberInTheString(password)){
            result = false;
            throw new WrongPasswordException("Password не соответствует заданному условию!");

        }
        return result;
    }

    public static boolean checkNumberInTheString(String someString){
        char[] array = someString.toCharArray();
        boolean checkNumber = false;

        for(int i = 0; i < array.length;i++){
            if(Character.isDigit(array[i])){
                checkNumber = true;
                break;
            }
        }
        return checkNumber;
    }
}
