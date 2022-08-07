public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenishment = 2000;
        int bonus = replenishment / 100;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int accountFinal = account + replenishment + bonus;

        System.out.println("Your accont: " + accountFinal + "");

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}
