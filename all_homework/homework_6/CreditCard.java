package all_homework.homework_6;

public class CreditCard { //task 1
    public long billingNumber;
    public long totalSum;

    public CreditCard(long billingNumber, long totalSum){
        this.billingNumber = billingNumber;
        this.totalSum = totalSum;
    }

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(111111111, 100);
        CreditCard creditCard2 = new CreditCard(222222222, 200);
        CreditCard creditCard3 = new CreditCard(333333333, 300);

        creditCard1.addSumToCreditCard(10);
        creditCard2.addSumToCreditCard(10);
        creditCard3.removeSomeSumToCreditCard(10);

        System.out.println(creditCard1.infoCreditCard());
        System.out.println(creditCard2.infoCreditCard());
        System.out.println(creditCard3.infoCreditCard());
    }

    public void addSumToCreditCard(long someValue){
        totalSum = totalSum + someValue;
    }

    public void removeSomeSumToCreditCard(long someValue){
        totalSum = totalSum - someValue;
    }
    public String infoCreditCard(){
        return "Номер счёта привязанный к карте: " + this.billingNumber + ", остаток на кредитсной карте " + this.totalSum + ".";
    }

}
