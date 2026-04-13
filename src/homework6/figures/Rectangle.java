package homework6.figures;

/*
Класс фигуры прямоугольника
 */
public class Rectangle extends Figure{
    private double width;
    private double height;

    // Конструктор класса прямоугольника
    public Rectangle(double width, double height) {
        super("Прямоугольник");
        this.width = width;
        this.height = height;
    }

    // Переопределение абстрактного метода для получения площади
    @Override
    public double getArea() {
        return width * height;
    }

    // Переопределение абстрактного метода для получения периметра
    @Override
    public double getPerimeter() {
        return 2 * (width * height);
    }

    // Getter для получение ширины
    public double getWidth() { return width; }

    //Getter для получения высоты
    public double getHeight() { return height; }
}
