public class Main {
    public static void main(String[] args) {
        int currentBalance = 5000; // начальный счет
        int refillAccount = 2200 ; // пополнение счёта
        int totalBalance;
        int totalBonus;
        if (refillAccount > 1000) {
            totalBonus = refillAccount/100; // начисленный бонус
            totalBalance = currentBalance+totalBonus+refillAccount;
            System.out.println("Вы пополнили счёт на: " + refillAccount + ", у вас "+totalBonus+" бонусов. Итоговая сумма: "+totalBalance+" руб.");
        }
        else {
            totalBalance = currentBalance + refillAccount;
            System.out.println("Вы пополнили счёт на: " + refillAccount + " руб., бонусов нет. Итоговая сумма:" + totalBalance + " руб.");
            }
    }
}
