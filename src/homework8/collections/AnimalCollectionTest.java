package homework8.collections;

/*
Тестовый класс для демонстрации работы AnimalCollection
 */
public class AnimalCollectionTest {
    public static void main(String[] args) {
        System.out.println("Задача 2: Коллекция животных");
        System.out.println("Правила: добавление - в начало, удаление - из конца");
        System.out.println();

        // Создаём объект коллекции
        AnimalCollection zoo = new AnimalCollection();

        // Показываем пустую коллекцию
        System.out.println("1. Пустая коллекция:");
        zoo.showAnimals();

        // Добавляем животных (каждое - в начало!)
        System.out.println("2. Добавляем животных:");
        zoo.addAnimal("Кошка");
        zoo.addAnimal("Собака");
        zoo.addAnimal("Попугай");
        zoo.addAnimal("Хомяк");
        zoo.showAnimals();

        // Удаляем животных (каждое - из конца!)
        System.out.println("3. Удаляем животных:");
        zoo.removeAnimal();  // Удалит "Кошка" (она в конце)
        zoo.showAnimals();

        zoo.removeAnimal();  // Удалит "Собака"
        zoo.showAnimals();

        // Добавляем ещё одного
        System.out.println("4. Добавляем ещё одного:");
        zoo.addAnimal("Рыба");
        zoo.showAnimals();

        // Удаляем всё
        System.out.println("5. Удаляем всех оставшихся:");
        while (zoo.getSize() > 0) {
            zoo.removeAnimal();
        }
        zoo.showAnimals();

        // Попытка удалить из пустой коллекции
        System.out.println("6. Попытка удалить из пустой коллекции:");
        zoo.removeAnimal();
    }
}