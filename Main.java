
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonusScale = 100;
        int amount = 1200;
        int bonus;
        if (amount > 1000) {
            bonus = amount / bonusScale;
        } else {
            bonus = 0;
        }
        int account = balance + bonus + amount;
        System.out.println("Вы пополнили счёт на " + amount + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + account + " руб.");
    }
}