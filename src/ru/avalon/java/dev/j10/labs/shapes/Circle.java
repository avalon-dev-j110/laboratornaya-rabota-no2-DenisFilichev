package ru.avalon.java.dev.j10.labs.shapes;


/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    PointOfShape firstPoint = new PointOfShape();
    PointOfShape secondPoint = new PointOfShape();
    
    /* Круг строится на основании двух точек.
    Одна точка является центром круга, другая точка лежит на окружности*/
    public Circle (int firstX, int firstY, int secondX, int secondY){
        firstPoint.setX(firstX); // координата первой точки ппо оси X
        firstPoint.setY(firstY); // координата первой точки ппо оси Y
        secondPoint.setX(secondX); // координата второй точки ппо оси X
        secondPoint.setY(secondY); // координата второй точки ппо оси Y
    }
    
    // метод для расчета радиуса круга
    private double getRadius(){
        double radius = SegmentBetweenPoints.segmentBetweenPoints(firstPoint, secondPoint);
        return radius;
    }
    
    // метод для расчета площади кргуа
    @Override
    public float getArea(){
        double area = Pi*Math.pow(getRadius(), 2);
        return (float)area;
    }
    
    // метод для расчета длины окружности
    @Override
    public float getLength() {
        double lenght = 2*Pi*getRadius();
        return (float)lenght;
    }

    @Override
    public String toString() {
        return "Круг (площадь = " + getArea() + ", длина окружности = " + getLength() + ')';
    }
}
