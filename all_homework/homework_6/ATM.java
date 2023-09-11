package all_homework.homework_6;

import java.util.Random;

public class ATM { //task 2
    long count20;
    long count50;
    long count100;

    public ATM( long count20, long count50, long count100){
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public static void main(String[] args) {
        ATM atm = new ATM(20, 50, 100);
        atm.addCashToTheATM();
        atm.removeCashToTheATM(860);
    }

    public void addCashToTheATM(){
        Random random = new Random();
        count20 += random.nextInt(20);
        count50 += random.nextInt(50);
        count100 += random.nextInt(100);
    }

    public boolean removeCashToTheATM(long sum){
        if(sum % 20 == 0){
            count20 -= sum / 20;
            System.out.println(sum / 20 + " - купюр выдано клиент, номиналом 20$");
            return true;
        }
        else if(sum % 50 == 0){
            count50 -= sum / 50;
            System.out.println(sum / 50 + " - купюр выдано клиент, номиналом 50$");
            return true;
        }
        else if(sum % 100 == 0){
            count100 -= sum / 100;
            System.out.println(sum / 100 + " - купюр выдано клиент, номиналом 100$");
            return true;
        }
        return false;
    }

}
