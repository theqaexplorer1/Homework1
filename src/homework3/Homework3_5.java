package homework3;

import java.util.Random;
import java.util.Scanner;

/*
пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его предпочтительно используя класс Random.
После заполнения массива данными, решить для него следующие
Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
 */
public class Homework3_5 {
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
        // Проходим по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.
        // Обходим только до середины массива, так как за один проход меняем пару элементов.
        // При чётном количестве элементов все пары будут обработаны. При нечётном центральный элемент остаётся на месте.
        for (int i = 0; i < array.length / 2; i++) {
            // индекс зеркального элемента с конца
            int j = array.length - 1 - i;
            int temp = array[i]; // сохраняем значение элемента с индексом i во временной переменной
            array[i] = array[j]; // на место i ставим элемент с индексом j
            array[j] = temp; // на место j ставим сохранённый ранее элемент (бывший array[i])
        }
        // Вывод массива после замены
        System.out.print("Массив после замены: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]" + " = " + array[i] + ", ");
        }
        System.out.println();
    }
}
