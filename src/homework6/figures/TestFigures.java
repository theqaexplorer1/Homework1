package homework6.figures;

/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве

Класс для проверки фигур
 */
public class TestFigures {
    public static void main(String[] args) {

        // Массив из 5 разных фигур
        Figure[] figures = {
                new Circle(10),
                new Rectangle(20, 25),
                new Triangle(10, 20, 30),
                new Rectangle(50, 60),
                new Rectangle(88, 100)
        };

        //Вывод информации о фигурах и суммы периметра всех фигур в массиве на экран
        System.out.println("Информация о фигурах в массиве: \n");
        //Счётчик периметра
        double perimeterCount = 0;

        for (Figure each : figures) {
            each.info();
            perimeterCount += each.getPerimeter();
        }

        System.out.printf("%nСумма периметров всех фигур: %.2f", perimeterCount);



    }
}
