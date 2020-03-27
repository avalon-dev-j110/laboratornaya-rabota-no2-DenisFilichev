package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Polygon{

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private float side1, side2;

    public void setSide1(float side1) {
        this.side1 = side1;
    }
    public void setSide2(float side2) {
        this.side2 = side2;
    }
    
    // метод для расчета площади прямоугольника
    public float getArea(){
        return side1*side2;
    }
    
    // метод для расчета периметра прямоугольника
    public float getPerimeter(){
        return side1*2+side2*2;
    }
}
