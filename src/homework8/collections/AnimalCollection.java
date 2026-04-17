package homework8.collections;

import java.util.LinkedList;

/*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */
public class AnimalCollection {
    // Коллекция для хранения животных (LinkedList — быстрый доступ к началу и концу)
    private LinkedList<String> animals;

    // Конструктор
    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    /*
    Добавление животного в начало коллекции
     */
    public void addAnimal(String animalName) {
        if (animalName != null && !animalName.trim().isEmpty()) {
            animals.addFirst(animalName.trim());
            System.out.printf("Добавлено: \"%s\" (в начало) %n", animalName.trim());
        } else {
            System.out.println("Ошибка: имя животного не может быть пустым!");
        }
    }
    /*
    Удаление животного
     */
    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Ошибка: коллекция пуста, нечего удалять!");
            return null;
        }
        String removed = animals.removeLast();
        System.out.printf("Удалено: \"%s\" (из конца) %n", removed);
        return removed;
    }

    /*
    Вывод текущего состояния
     */
    public void showAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста");
        } else {
            System.out.println("Текущий список животных:");
            int index = 1;
            for (String animal : animals) {
                System.out.printf("  %s. %s %n", index++, animal);
            }
        }
        System.out.println();
    }

    /*
    Возврат текущего количества животных в коллекции
     */
    public int getSize() {
        return animals.size();
    }

    /*
    Очистка коллекции
     */
    public void clear() {
        animals.clear();
        System.out.println("Коллекция очищена");
    }
}