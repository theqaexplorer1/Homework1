package homework7;

import java.util.Scanner;

/*
Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */
public class Homework7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 5: Дублирование букв");

        // Ввод строки
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Дублируем каждую букву
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result.append(c).append(c);
        }

        // Вывод результата
        System.out.printf("Результат: \"%s\" %n", result.toString());

        scanner.close();
    }
}
