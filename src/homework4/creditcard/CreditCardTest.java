package homework4.creditcard;

/*
Напишите программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */
public class CreditCardTest {
    public static void main(String[] args) {
        // создать три объекта credit card
        CreditCard card1 = new CreditCard("122132323", 9300.00);
        CreditCard card2 = new CreditCard("122132388", 60150.45);
        CreditCard card3 = new CreditCard("9922132323", 803690.30);
        //отобразить изначальный баланс карт
        card1.info();
        card2.info();
        card3.info();
        //пополнить первые две карты
        card1.deposit(500.05);
        card2.deposit(1000.15);
        //снять деньги с третьей карты
        card3.withdraw(1000);
        //вывод на экран текущего состояния всех трёх карт
        card1.info();
        card2.info();
        card3.info();
    }
}
