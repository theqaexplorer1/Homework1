package homework3;

import java.util.Scanner;
import java.util.Random;

/*
пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его предпочтительно используя класс Random.
После заполнения массива данными, решить для него следующие
Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
 */
public class Homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Определение размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        //Заполнение массива
        System.out.print("Массив заполняется: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); //вводим в индекс массива числа от 0 до 100
            System.out.print("[" + i + "]" + " = " + array[i] + ", ");
        }
        System.out.println();
        //Вывод массива в прямом порядке
        System.out.println("Чтение из массива в прямом порядке");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]" + " = " + array[i] + ", ");
        }
        System.out.println();
        //Вывод массива в обратном порядке
        System.out.println("Чтение из массива в обратном порядке");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("[" + i + "]" + " = " + array[i] + ", ");
        }
        System.out.println();
    }
}
