package homework3;

import java.util.Random;
import java.util.Scanner;

/*
пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его предпочтительно используя класс Random.
После заполнения массива данными, решить для него следующие
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
 */
public class Homework3_4 {
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
            array[i] = random.nextInt(120) - 20; //вводим в индекс массива числа от -20 до 100
            System.out.print("[" + i + "]" + " = " + array[i] + ", ");
        }
        System.out.println();
        // Находим и выводим количество нулевых элементов.
        // Если нулевых элементов нет - выводим сообщение, что их нет.
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) counter++;
        }
        if (counter > 0) {
            System.out.println("Количество нулевых элементов в массиве: " + counter);
        } else {
            System.out.println("Нет нулевых элементов в массиве");
        }
    }
}
