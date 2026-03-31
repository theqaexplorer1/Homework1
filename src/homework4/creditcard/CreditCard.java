package homework4.creditcard;

/*
Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */
public class CreditCard {
    private String accountNumber; // номер счёта
    private double balance; //текущая сумма на счету

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // методы для пополнения счёта
    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На счёт " + accountNumber + " начислено " + amount + " руб.");
        } else {
            System.out.println("Сумма должна быть положительной!");
        }
    }

    // метод для снятия со счёта
    public void withdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Со счёта " + accountNumber + " списано " + amount + " руб.");
        } else if (amount <= 0) {
            System.out.println("Сумма должна быть положительной!");
        } else {
            System.out.println("Недостаточно средств на счету");
        }
    }

    // методы выводящий информацию о карточке
    public void info () {
        System.out.println("Карта №" + accountNumber + ", баланс: " + balance + " руб.");
    }

    // геттер для получения номера счёта
    public String getNumber() {
        return accountNumber;
    }

    // геттер для получения баланса
    public double getBalance() {
        return balance;
    }
}
