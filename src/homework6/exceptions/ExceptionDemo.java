package homework6.exceptions;

/*
Задача 1:
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */
public class ExceptionDemo {

    // Простой try-catch с обработкой деления на 0
    public static double divide(int a, int b) {
        double result = 0;
        try {
            result = a / b;  // Может выбросить ArithmeticException
            System.out.printf("Деление успешно: %s / %s = %s", a, b, result);
        } catch (ArithmeticException e) {
            System.out.printf("Ошибка: Деление на ноль!%n");
        }
        return result;
    }

    // try-catch, где catch будет несколько при работе с массивами
    public static int getElement(int[] array, int index) {
        int value = 0;
        try {
            value = array[index];  // Может выбросить ArrayIndexOutOfBoundsException
            System.out.printf("Элемент найден: %s %n", value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Ошибка: Индекс %s выходит за границы массива!%n", index);
        } catch (NullPointerException e) {
            System.out.printf("Ошибка: Массив равен null! %n");
        }
        return value;
    }

    // 3. try-catch с использованием multi-catch
    public static int parseNumber(String input) {
        int number = 0;
        try {
            number = Integer.parseInt(input);  // Может выбросить NumberFormatException
            System.out.printf("Число распарсено: %s %n", number);
        } catch (NumberFormatException | NullPointerException e) {
            // Multi-catch: ловим оба исключения одним блоком
            System.out.printf("Ошибка: Невозможно преобразовать '%s' в число! %n", input);
        }
        return number;
    }

    // 4. try-catch-finally
    public static void processFile(String fileName) {
        boolean fileOpened = false;
        try {
            System.out.printf("Попытка открыть файл: %s %n", fileName);
            // Имитация: файл открывается, только если имя не пустое
            if (fileName == null || fileName.isEmpty()) {
                throw new IllegalArgumentException("Имя файла не может быть пустым!");
            }
            fileOpened = true;
            System.out.printf("Файл '%s' успешно открыт! %n", fileName);
        } catch (IllegalArgumentException e) {
            System.out.printf("Ошибка: %s %n", e.getMessage());
        } finally {
            // Выполняется ВСЕГДА
            System.out.println("Блок finally: освобождаем ресурсы...");
            if (fileOpened) {
                System.out.println("Ресурсы освобождены");
            } else {
                System.out.println("Ресурсы не требовались");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // Тестирование 1: Один try-catch (деление)
        System.out.println("Тест 1: Простой try-catch");
        ExceptionDemo.divide(10, 2); //Успешно
        ExceptionDemo.divide(10, 0);
        System.out.println();

        // Тестирование 2: Несколько catch-блоков (массив)
        System.out.println("Тест 2: Несколько catch");
        int nums[] = {10, 20, 55, 47, 60};
        ExceptionDemo.getElement(nums, 1); //Успешно
        ExceptionDemo.getElement(nums, 10);
        ExceptionDemo.getElement(null, 0);
        System.out.println();

        // Тестирование 3: Multi-catch (парсинг)
        System.out.println("Тест 3: Multi-catch");
        ExceptionDemo.parseNumber("123"); // Успешно
        ExceptionDemo.parseNumber("abc");
        ExceptionDemo.parseNumber(null);
        System.out.println();

        // Тестирование 4: try-catch-finally (файл)
        System.out.println("Тест 4: try-catch-finally");
        ExceptionDemo.processFile("data.txt"); // Успешно
        ExceptionDemo.processFile("");
        ExceptionDemo.processFile(null);
    }

}
