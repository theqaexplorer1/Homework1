package homework7;

import java.util.Scanner;

/*
Задача 4:
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
 */
public class Homework7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 4: Слово из уникальных символов");

        // Ввод 3 строк
        System.out.print("Введите строку 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String s2 = scanner.nextLine();
        System.out.print("Введите строку 3: ");
        String s3 = scanner.nextLine();

        String[] arr = {s1, s2, s3};
        String result = null;

        // Ищем первое слово с уникальными символами
        for (String s : arr) {
            if (hasUniqueChars(s)) {
                result = s;
                break;
            }
        }

        // Вывод результата
        if (result != null) {
            System.out.printf("Первое слово из уникальных символов: \"%s\" %n", result);
        } else {
            System.out.println("Таких слов не найдено");
        }

        scanner.close();
    }

    // Вспомогательный метод: проверка уникальности символов
    private static boolean hasUniqueChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;  // Нашли повтор
                }
            }
        }
        return true;  // Все символы уникальны
    }
}
