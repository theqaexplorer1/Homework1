package homework2;

import java.util.Scanner;

/*
Задача *:
Напишите программу, где пользователь вводит любое целое положительное
число.

А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
 */
public class Homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Введите любое целое положительное число: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    isValid = true;
                } else {
                    System.out.println("Вы ввели отрицательное число.");
                }
            } else {
                System.out.println("Ошибка: Введите положительное число!");
                scanner.next();
            }
        }

        int total = 0;
        int i = 1;
        while (i <= n) {
             total = total + i;
             i ++;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + total);
    }

}
