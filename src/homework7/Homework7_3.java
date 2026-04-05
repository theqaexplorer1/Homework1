package homework7;

import java.util.Scanner;

/*
Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */
public class Homework7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 3: Строки короче средней");

        // Ввод 3 строк
        System.out.print("Введите строку 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String s2 = scanner.nextLine();
        System.out.print("Введите строку 3: ");
        String s3 = scanner.nextLine();

        // Помещаем в массив
        String[] arr = {s1, s2, s3};

        // Считаем среднюю длину
        double average = (s1.length() + s2.length() + s3.length()) / 3.0;

        System.out.printf("Средняя длина: %.2f %n", average);
        System.out.println("Строки короче средней:");

        // Выводим строки короче средней
        for (String s : arr) {
            if (s.length() < average) {
                System.out.printf("\"%s\" (длина: %s) %n", s, s.length());
            }
        }

        scanner.close();
    }
}
