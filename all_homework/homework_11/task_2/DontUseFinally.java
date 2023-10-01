package all_homework.homework_11.task_2;

public class DontUseFinally {
    public static void main(String[] args) {
        boolean someValue = true;

//        first: // не получилось, не фартанула, парень у успеху шел =(
//        if(someValue)
//        try{
//            int i = 1/0;
//            someValue = false;
//            break first;
//
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//
//        }finally {
//            System.out.println("finally вызван!");
//        }


            try{
                int i = 1/0;
                someValue = false;


            }catch (ArithmeticException e){
                e.printStackTrace();
                System.exit(0); // готово =)
            }finally {
                System.out.println("finally вызван!");
            }

        /**
         * Блок finally предотвращает выполнение...
         *
         * Когда вы вызывали System.exit(0);
         * Если JVM завершает работу.
         * Ошибки в JVM
         */
    }
}
