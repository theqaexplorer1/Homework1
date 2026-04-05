package homework7;

import java.util.Scanner;

/*
Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */
public class Homework7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Самая короткая и длинная строка");

        // Ввод 3 строк
        System.out.print("Введите строку 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String s2 = scanner.nextLine();
        System.out.print("Введите строку 3: ");
        String s3 = scanner.nextLine();

        // Ищем самую короткую и длинную
        String shortest = s1;
        String longest = s1;

        if (s2.length() < shortest.length()) {
            shortest = s2;
        }
        if (s3.length() < shortest.length()) {
            shortest = s3;
        }
        if (s2.length() > longest.length()) {
            longest = s2;
        }
        if (s3.length() > longest.length()) {
            longest = s3;
        }

        // Вывод результата
        System.out.printf("Самая короткая: \"%s\" (длина: %s) %n", shortest, shortest.length());
        System.out.printf("Самая длинная: \"%s\" (длина: %s) %n", longest, longest.length());

        scanner.close();
    }
}
