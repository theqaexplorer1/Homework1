package homework3;

import java.util.Random;
import java.util.Scanner;

/*
пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его предпочтительно используя класс Random.
После заполнения массива данными, решить для него следующие
Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
 */
public class Homework3_3 {
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
        // находим индекс максимального и минимального элемента в массиве
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            // Если текущий элемент меньше элемента, хранящегося по индексу minIndex,
            // обновляем индекс минимального элемента
            if (array[i] < array[minIndex]) minIndex = i;
            // Если текущий элемент больше элемента, хранящегося по индексу maxIndex,
            // обновляем индекс максимального элемента
            if (array[i] > array[maxIndex]) maxIndex = i;
        }
        System.out.println("Индекс минимального элемента в массиве: " + minIndex);
        System.out.println("Индекс максимального элемента в массиве: " + maxIndex);
    }
}
