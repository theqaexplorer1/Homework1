package homework8.collections;

import java.util.HashMap;
import java.util.Map;

/*
Задача 3:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз.
Пример:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 */
public class Homework8_3 {
    /*
    Возвращает Map, где ключ - строка из массива,
     * значение - true, если строка встречается 2+ раз
     */
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> result = new HashMap<>();

        for (String word : words) {
            if (word == null) continue;  // Пропускаем null

            if (result.containsKey(word)) {
                // Уже видели эту строку - ставим true (встречается 2+ раз)
                result.put(word, true);
            } else {
                // Первый раз видим - ставим false
                result.put(word, false);
            }
        }

        return result;
    }

    /*
    Метод для вывода
     */
    public static void printMap(Map<String, Boolean> map) {
        System.out.print("{");
        int count = 0;
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            System.out.printf("\"%s\": %s", entry.getKey(), entry.getValue());
            count++;
            if (count < map.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}