package homework6.figures;

/*
Класс треугольника
 */
public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    // Конструктор класса треугольника
    public Triangle(double sideA, double sideB, double sideC) {
        super("Треугольник");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Переопределение абстрактного метода для получения площади
    @Override
    public double getArea() {
        // Формула Герона
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    // Переопределение абстрактного метода для получения периметра
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    // Getters для получения каждой из сторон
    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }
    public double getSideC() { return sideC; }
}
