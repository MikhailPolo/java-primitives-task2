public class Main {
    public static void main(String[] args) {
        int balance = 100; //начальный баланс
        int addBalance = 1100;    //сумма пополнения
        int bonuse = 1;    //кол-во бонусов
        int addBonuse;

        if (addBalance >= 1000) {
            addBonuse = addBalance / 100 * bonuse;
        } else {
            addBonuse = 0;
        }
        System.out.println("Баланс:" + (balance + addBalance + addBonuse));
    }
}