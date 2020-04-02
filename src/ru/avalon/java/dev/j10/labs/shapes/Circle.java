package ru.avalon.java.dev.j10.labs.shapes;

public class Circle implements Ellipse{

    Point firstPoint;
    Point secondPoint;
    
    /* Круг строится на основании двух точек.
    Одна точка является центром круга, другая точка лежит на окружности*/
    public Circle (Point firstPoint, Point secondPoint){
        this.firstPoint=firstPoint;
        this.secondPoint=secondPoint;
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
