package homework8;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
/*
Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */
public class Homework8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Удаление дубликатов из строки чисел");

        // Ввод строки с числами
        System.out.print("Введите числа через запятую: ");
        String input = scanner.nextLine();

        // Разбиваем строку на массив строк по запятой
        String[] parts = input.split(",");

        // Применяем коллекцию для удаления дубликатов с сохранением порядка
        Set<String> uniqueNumbers = new LinkedHashSet<>();

        for (String part : parts) {
            // убираем пробелы по краям
            String trimmed = part.trim();
            if (!trimmed.isEmpty()) {
                uniqueNumbers.add(trimmed);
            }
        }

        // Вывод результата
        System.out.print("Результат: ");
        int count = 0;
        for (String num : uniqueNumbers) {
            System.out.print(num);
            count++;
            // Добавляем запятую после каждого числа, кроме последнего
            if (count < uniqueNumbers.size()) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.printf("Было чисел: %s, стало уникальных: %s %n",
                parts.length, uniqueNumbers.size());

        scanner.close();
    }
}
