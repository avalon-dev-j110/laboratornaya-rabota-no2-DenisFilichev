package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle {

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private float side1, side2, side3;

    public void setSide1(float side1) {
        this.side1 = side1;
    }
    public void setSide2(float side2) {
        this.side2 = side2;
    }
    public void setSide3(float side3) {
        this.side3 = side3;
    }
    
    // метод для расчета площади треугольника
    public float getArea(){
        float per = (side1+side2+side2)/2;
        double area = Math.sqrt(per*(per-side1)*(per-side2)*(per-side3));
        return (float)area;
    }
    
    // метод для расчета периметра треугольника
    public float getPerimeter(){ 
        return (side1+side2+side2)/2;
    }
}
