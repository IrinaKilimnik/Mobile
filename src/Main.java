public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальный счет
        int replenishment = 1100; // сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

            int finalScore = startingScore + bonus;

            System.out.println(bonus + " составил бонус за пополнение счета");
            System.out.println("Сумма счета с учетом бонуса составила " + finalScore);

    }
}