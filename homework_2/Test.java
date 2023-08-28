package homework_2;


import static java.lang.Character.getNumericValue;

public class Test {
    public static void main(String[] args) {
        System.out.println(firstTask(7.7,7.0)); //task 1
        System.out.println(secondTask(25)); // task 2
        System.out.println(thirdTask(128)); //task 3
        System.out.println(fourthTask(5.5424234234234141)); //task 4
        System.out.println(fifthTask(21, 8)); //task 5
        System.out.println(sixthTask(1, 2)); //task 6
    }

    public static double firstTask(double b, double c){
        return 4*(b+c-1)/2;
    }
    public static int secondTask(long n){
        String stroka = n + "";
        char [] ch = stroka.toCharArray();
        return getNumericValue(ch[0]) + getNumericValue(ch[1]);
    }
    public static int thirdTask(long n){
        String stroka = n + "";
        char [] ch = stroka.toCharArray();

        int b = 0;

        for(int i = 0; i < ch.length; i++){
            b = b + getNumericValue(ch[i]);
        }

        return b;
    }

    public static long fourthTask(double n){
        return Math.round(n);
    }

    public static double fifthTask(int q, int w){
        return (double)q/w + (float)q%w; //  5/8 = 0.625
    }

    public static String sixthTask(int a, int b) {
        return b + "" + a;
    }
}
