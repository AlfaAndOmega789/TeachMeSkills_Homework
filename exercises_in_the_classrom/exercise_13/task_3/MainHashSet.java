package exercises_in_the_classrom.exercise_13.task_3;

import java.util.HashSet;
import java.util.Iterator;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<Person> hashSetPerson = new HashSet<>(); // task 3.2
        hashSetPerson.add(new Person());
        hashSetPerson.add(new Person());
        hashSetPerson.add(new Person());

        for(Person person : hashSetPerson){ //task 3.3
            System.out.println(person);
        }
        Iterator<Person> iterator = hashSetPerson.iterator();

        while (iterator.hasNext()){ // не понимать, спросить
            int i = 0;
            if(i == 1){
                iterator.remove();
            }
            iterator.next();
            i++;

        }
        System.out.println(hashSetPerson); //task 3.4

        System.out.println(hashSetPerson.contains(new Person())); //task 3.5
    }
}
