package homework6.figures;

/*
Класс фигуры круга
 */
public class Circle extends Figure {
    private double radius;

    // конструктор класса
    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    // Переопределение абстрактного метода для получения площади
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Переопределение абстрактного метода для получения периметра
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Getter для получения радиуса
    public double getRadius() {
        return radius;
    }
}
