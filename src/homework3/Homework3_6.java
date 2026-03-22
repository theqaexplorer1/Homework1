package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его предпочтительно используя класс Random.
После заполнения массива данными, решить для него следующие
Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
 */
public class Homework3_6 {
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
        // Проверить, является ли массив возрастающей последовательностью (каждое
        //следующее число больше предыдущего).
        boolean isAsc = true; // по умолчанию считаем массив возрастающим
        for (int i = 0; i < array.length - 1; i++) { //ограничить цикл до предпоследнего элемента
            if (array[i] >= array[i + 1]) { // если текущий или больше или равен следующему
                isAsc = false;
                break; // дальше не проверяем
            }
        }
        if (isAsc) {
            System.out.println("Массив является возрастающей последовательностью " + Arrays.toString(array));
        } else {
            System.out.println("Массив не является возрастающей последовательностью " + Arrays.toString(array));
        }
    }
}
