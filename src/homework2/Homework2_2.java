package homework2;

import java.util.Arrays;
import java.util.Scanner;

/*
Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
«Warm».
Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */
public class Homework2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.print("«Warm»");
        } else if (t <= -5 && t > -20) {
            System.out.println("«Normal»");
        } else {
            System.out.println("«Cold»");
        }
    }

}
