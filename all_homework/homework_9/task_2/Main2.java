package all_homework.homework_9.task_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Rabbit rabbit = new Rabbit();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        rabbit.eat("Grass");
        rabbit.eat("Bone");
        dog.eat("Bone");
        dog.eat("grass");
        tiger.eat("Meat");
        tiger.eat("Bone");

        List<Constructor> list = new ArrayList<>();
        for (Constructor<?> constructor : dog.getClass().getConstructors()) {
            if(constructor.getParameters()[0] != null){
                list.add(constructor);
            }
        }
        list.get(0).setAccessible(true);
        Dog flatty = (Dog)list.get(0).newInstance("flatty");
        flatty.eat("Meat");
        flatty.voice();

        List<Constructor<?>> constructors = Arrays.stream(dog.getClass().getConstructors())
                .filter(constructor -> constructor.getParameters()[0] != null)
                .collect(Collectors.toList());

        Constructor<?> constructor = constructors.get(0);
        constructor.setAccessible(true);
        Dog bobby = (Dog)constructor.newInstance("bobby");
        bobby.eat("Bone");
        bobby.voice();
    }
}
