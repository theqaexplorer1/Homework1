package homework7;

import java.util.Scanner;

/*
Задача 2:
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
 */
public class Homework7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 2: Сортировка по длине");

        // Ввод 3 строк
        System.out.print("Введите строку 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String s2 = scanner.nextLine();
        System.out.print("Введите строку 3: ");
        String s3 = scanner.nextLine();

        // Помещаем в массив
        String[] arr = {s1, s2, s3};

        // Сортировка пузырьком по длине
        for (int i = 0; i < arr.length - 1; i++) {        // Внешний цикл
            for (int j = 0; j < arr.length - 1 - i; j++) { // Внутренний цикл
                if (arr[j].length() > arr[j + 1].length()) { // Сравнение длин
                    // Обмен местами
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Вывод результата
        System.out.println("Строки по возрастанию длины:");
        for (String s : arr) {
            System.out.printf("\"%s\" (длина: %s) %n", s, s.length());
        }

        scanner.close();
    }
}
