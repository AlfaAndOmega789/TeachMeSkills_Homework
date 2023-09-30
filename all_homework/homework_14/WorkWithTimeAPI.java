package all_homework.homework_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class WorkWithTimeAPI {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = {-6,3,2};

//        hundredYEars( //task 1
//                Integer.parseInt(reader.readLine()),
//                    Integer.parseInt(reader.readLine()),
//                        Integer.parseInt(reader.readLine()));
//        numberCheck(array); //task 2
//        converterCurrency("300 BYN"); //task 3
//        workWithConsumer("500 BYN"); //task 4
        reverseString("Hello world!"); // task 5

    }

    public static void hundredYEars(Integer i1, Integer i2, Integer i3){ //task 1
        LocalDate localDate = LocalDate.of(i1 + 100, i2, i3);

        System.out.println(localDate);
    }

    public static void numberCheck(int[] array){ //task 2
        Predicate<Integer> check = i -> i > 0;

        for(int i = 0; i < array.length;i++){
            if(check.test(array[i]))
                System.out.println(array[i]);
        }
    }

    public static void converterCurrency(String value){ //task 3
        Function<String, Integer> function = i ->{
            String someValue1 = i.replaceAll(" BYN", "");
            int someValue2 = (int) (Integer.parseInt(someValue1) * 3.3);
            return someValue2;
            //return "Сумма в бел. руб. до конвертации: " + someValue1 +" ,после: " + someValue2;
        };
        System.out.println(function.apply(value) + " USD");
    }

    public static void workWithConsumer(String value){ //task 4
        Consumer<String> consumer = i -> {
            String someValue1 = i.replaceAll(" BYN", "");
            int someValue2 = (int) (Integer.parseInt(someValue1) * 3.3);
            System.out.println(someValue2 + " USD");
        };
        consumer.accept(value);
    }

    public static void reverseString(String value){ // task 5
        Supplier<String> sup = () ->{
            String newValue = "";
            char[] array = value.toCharArray();
            for(int i = array.length - 1; 0 <= i; i--){
                newValue += array[i];
            }
            return newValue;
        };
        System.out.println(sup.get());
    }
}
