package all_homework.homework_8.task_2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple("Red");

        Class<? extends Apple> appleClass = apple.getClass();
        Field serialColorField = appleClass.getDeclaredField("Green");

        String serialColorValue = (String) serialColorField.get(apple); // не понимать =(
        System.out.println(serialColorField);
    }
}
