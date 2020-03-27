package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Shape, Ellipse{
    private float radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    public float getArea (){
        double s = Pi*Math.pow(radius, 2);
        return (float)s;
    }
    
    public float getLength() {
        double p = 2*Pi*radius;
        return (float)p;
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
