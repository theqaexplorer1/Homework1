package homework2;

import java.util.Scanner;

/*
Задача 1:
Напишите программу, которая будет принимать на вход число из консоли и на
выход будет выводить сообщение четное число или нет. Для определения
четности числа используйте операцию получения остатка от деления (операция
выглядит так: '% 2').
*/
public class Homework2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        if  (n % 2 == 0) {
            System.out.println(n + " - чётное число");
        } else {
            System.out.println(n + " - нечётное число");
        }
    }

}
