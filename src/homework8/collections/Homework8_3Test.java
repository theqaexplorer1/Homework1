package homework8.collections;

import java.util.Map;

/*
Тестовый класс для демонстрации работы wordMultiple
 */
public class Homework8_3Test {
    public static void main(String[] args) {

        // Тест 1: Пример из условия
        System.out.println("Тест 1: [\"a\", \"b\", \"a\", \"c\", \"b\"]");
        String[] test1 = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> result1 = Homework8_3.wordMultiple(test1);
        System.out.print("Результат: ");
        Homework8_3.printMap(result1);
        System.out.println("Ожидание:  {\"a\": true, \"b\": true, \"c\": false}");
        System.out.println();

        // Тест 2: Все строки уникальны
        System.out.println("Тест 2: [\"c\", \"b\", \"a\"]");
        String[] test2 = {"c", "b", "a"};
        Map<String, Boolean> result2 = Homework8_3.wordMultiple(test2);
        System.out.print("Результат: ");
        Homework8_3.printMap(result2);
        System.out.println("Ожидание:  {\"a\": false, \"b\": false, \"c\": false}");
        System.out.println();

        // Тест 3: Одна строка много раз
        System.out.println("Тест 3: [\"c\", \"c\", \"c\", \"c\"]");
        String[] test3 = {"c", "c", "c", "c"};
        Map<String, Boolean> result3 = Homework8_3.wordMultiple(test3);
        System.out.print("Результат: ");
        Homework8_3.printMap(result3);
        System.out.println("Ожидание:  {\"c\": true}");
        System.out.println();

        // Тест 4: Пустой массив
        System.out.println("Тест 4: [] (пустой массив)");
        String[] test4 = {};
        Map<String, Boolean> result4 = Homework8_3.wordMultiple(test4);
        System.out.print("Результат: ");
        Homework8_3.printMap(result4);
        System.out.println("Ожидание:  {}");
        System.out.println();

        // Тест 5: Смешанный случай
        System.out.println("Тест 5: [\"apple\", \"banana\", \"apple\", \"cherry\", \"banana\", \"apple\"]");
        String[] test5 = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        Map<String, Boolean> result5 = Homework8_3.wordMultiple(test5);
        System.out.print("Результат: ");
        Homework8_3.printMap(result5);
        System.out.println("Ожидание:  {\"apple\": true, \"banana\": true, \"cherry\": false}");
    }
}