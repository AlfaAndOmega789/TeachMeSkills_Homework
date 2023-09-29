package all_homework.homework_13.task_2;

import java.util.ArrayList;

public class MainAnimals {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Cat().toString());
        list.add(new Rino().toString());
        list.add(new Dog().toString());

        for(Object obj : list){
            System.out.println(obj);
        }

        deleteLastObjectFromACollection(list);
        System.out.println();

        for(Object obj : list){
            System.out.println(obj);
        }

        addToTheBeginingOfTheCollection(list, new Cat().toString());
        System.out.println();

        for(Object obj : list){
            System.out.println(obj);
        }
    }

    public static void deleteLastObjectFromACollection(ArrayList<Object> list){
        list.remove(list.size() - 1);
    }
    public static void addToTheBeginingOfTheCollection(ArrayList<Object> list, Object obj){
        list.add(0, obj);
    }
}
