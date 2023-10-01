package exercises_in_the_classrom.exercise_10.task_1;

import java.util.Arrays;

public class MainStrings {
    public static void main(String[] args) {
//        System.out.println(firstMethodConcat(new StringBuilder("Hello"), new StringBuilder(" Java!"))); //task 1.1
//        System.out.println(secondMethodConcat("Hello", " Java!")); //task 1.2
//        System.out.println(substringFromTheThirdCharacter(new StringBuilder("Hello Java!"))); //task 1.3
//        lengthString("Java!"); //task 1.4
//        symbolSerialNumber("Hello Java!", 'l'); // task 1.5
//        transformationTrue(true); //task 1.6
//        convertStringToUpperCase("Hello"); //task 1.7
//        replacingOneInAString("1001"); //task 1.8
//        removeSpacesFromBeginningAndEnd(" Java ! "); //task 1.9
//        checkingForEmptyString("World"); //task 1.10
        splittingStringByDivisor("Hello Java!");

    }

    public static StringBuilder firstMethodConcat(StringBuilder str1, StringBuilder str2){ //task 1.1
        return str1.append(str2);
    }
    public static String secondMethodConcat(String str1, String str2){ //task 1.2
        return str1 + str2;
    }
    public static StringBuilder substringFromTheThirdCharacter(StringBuilder str){ //task 1.3
        str.delete(0, 4);
        return str;
    }
    public static void lengthString(String str){ //task 1.4
        System.out.println("Длина строки: " + str.length());
    }
    public static void symbolSerialNumber(String str, char c){ //task 1.5
        char[] ch = str.toCharArray();

        for(int i = 0; i < str.length();i++){
            if(ch[i] == c){
                System.out.print(i + " ");
            }
        }
    }
    public static void transformationTrue(boolean tr){ //task 1.6
        System.out.println(tr + "");
    }
    public static void convertStringToUpperCase(String str){ //task 1.7
        System.out.println(str.toUpperCase());
    }
    public static void replacingOneInAString(String str){ //task 1.8
        String stroka = "";
        char[] ch = str.toCharArray();

        for(int i = 0; i < str.length();i++){
            if(ch[i] == '1'){
                ch[i] = '%';
            }
            stroka += ch[i];
        }
        System.out.println(stroka);
    }
    public static void removeSpacesFromBeginningAndEnd(String str){ //task 1.9
        System.out.println(str.trim());
    }
    public static void checkingForEmptyString(String str){ //task 1.10
        System.out.println(str.isEmpty());
    }
    public static void splittingStringByDivisor(String str){ //task 1.11
        String[] array = str.split(" ");
        System.out.println(Arrays.deepToString(array));
    }
}
