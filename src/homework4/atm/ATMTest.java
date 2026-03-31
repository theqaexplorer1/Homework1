package homework4.atm;

/*
Тестовый класс для проверки работы банкомата
 */
public class ATMTest {
    public static void main(String[] args) {
        // Создаём банкомат с начальным набором купюр
        ATM atm = new ATM(50, 100, 300);

        System.out.println("Начальное состояние банкомата");
        atm.info();

        System.out.println("\nПопытка снятия 650 рублей");
        boolean result1 = atm.withdrawMoney(650);
        System.out.println("Успешно: " + result1);

        System.out.println("\nТекущее состояние банкомата");
        atm.info();

        System.out.println("\nДобавляем деньги в банкомат");
        atm.addMoney(5, 2, 1);

        System.out.println("\nСостояние после пополнения");
        atm.info();

        System.out.println("\nПопытка снятия 500 рублей");
        boolean result2 = atm.withdrawMoney(500);
        System.out.println("Успешно: " + result2);

        System.out.println("\nИтоговое состояние банкомата");
        atm.info();
    }
}
