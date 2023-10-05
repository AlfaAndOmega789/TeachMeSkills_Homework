package exercises_in_the_classrom.exercise_15.task_1;

import java.util.Optional;

import static javax.swing.Action.DEFAULT;

public class MainUser {
    static User user;
    public static void main(String[] args) {

        Optional<User> optional = Optional.ofNullable(user);

        if(optional.isPresent() == true){
            System.out.println("User name is Ivan!");
        }else{
            System.out.println(DEFAULT);
        }

    }
}
