package homework4.atm;
/*
Задача 2:
Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
 */
public class ATM {
    // свойства для определения количества купюр номиналом 20, 50 и 100
    private int count20;
    private int count50;
    private int count100;

    // конструктор класса
    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    // метод для добавления денег в банкомат
    public void addMoney(int count20, int count50, int count100) {
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
        System.out.println("Добавлено: " + count20 + " x 20, " + count50 + " x 50, " + count100 + " x 100");
    }

    // функция, снимающую деньги, которая принимает сумму денег, а
    // возвращает булевое значение - успешность выполнения операции.
    public boolean withdrawMoney (int withdrawAmount){
        // проверяем количество купюр в банкомате и считаем общую сумму денег
        int totalAmount = (count20 * 20) + (count50 * 50) + (count100 * 100);
        // запрошенная сумма должна быть положительной
        if (withdrawAmount <= 0) {
            System.out.println("Сумма должна быть положительной!");
            return false;
        }
        // запрошенная сумма должна быть кратна 10
        if (withdrawAmount % 10 != 0) {
            System.out.println("Сумма должна быть кратна 10!");
            return false;
        }
        // запрошенная сумма не должна превышать сумму денег в банкомате
        if (withdrawAmount > totalAmount) {
            System.out.println("Недостаточно средств в банкомате!");
            return false;
        }
        // Пытаемся выдать деньги, сначала крупные купюры
        int return100 = withdrawAmount / 100;
        int return50 = (withdrawAmount % 100) / 50;
        int return20 = ((withdrawAmount % 100) % 50) / 20;

        // проверка: хватает ли купюр
        if (return100 > count100 || return50 > count50 || return20 > count20) {
            // Пытаемся разменять крупными купюрами
            // Если не хватает, пробуем пересчитать
            System.out.println("Недостаточно купюр нужного номинала!");
            return false;
        }
        // Выдаём купюры
        count100 -= return100;
        count50 -= return50;
        count20 -= return20;

        System.out.println("Выдано: " + return100 + " x 100, " + return50 + " x 50, " + return20 + " x 20");
        System.out.println("Снято: " + withdrawAmount + " руб.");
        return true;
    }

    // Метод для отображения состояния банкомата
    public void info() {
        int total = count20 * 20 + count50 * 50 + count100 * 100;
        System.out.println("В банкомате: " + count20 + " x 20, " + count50 + " x 50, " + count100 + " x 100");
        System.out.println("Общая сумма: " + total + " руб.");
    }

    //геттеры для определения количества купюр номиналом 20, 50 и 100
    public int getCount20() {
        return count20;
    }

    public int getCount50() {
        return count50;
    }

    public int getCount100() {
        return count100;
    }
}
