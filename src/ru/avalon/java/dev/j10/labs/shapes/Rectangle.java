package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    int angle; // угол (в градусах) между диагональю прямоугольника и одной из его сторон
    PointOfShape firstPoint = new PointOfShape(); // первая точка диагонали прямоугольника
    PointOfShape secondPoint = new PointOfShape();// вторая точка диагонали прямоугольника
    
    
    /* Прямоугольник строится исходя из двух точек с заданными координатами,
    между которыми проводится отрезок (диагональ прямоугольника),
    и угла между диагональю и одной из сторон прямоугольника*/
    public Rectangle (int firstX, int firstY, int secondX, int secondY, int angle){
        firstPoint.setX(firstX); // координата первой точки ппо оси X
        firstPoint.setY(firstY); // координата первой точки ппо оси Y
        secondPoint.setX(secondX); // координата второй точки ппо оси X
        secondPoint.setY(secondY); // координата второй точки ппо оси Y
        this.angle = angle;
    }
    
    // метод для расчета первой стороны прямоугольника
    private double getFirstSide(){
        double diag = SegmentBetweenPoints.segmentBetweenPoints(firstPoint, secondPoint);
        double firstSide = diag*Math.sin(angle*Math.PI/180);
        return firstSide;
    }
    
    // метод для расчета второй (прилегающей к первой) стороны прямоугольника
    private double getSecondSide(){
        double diag = SegmentBetweenPoints.segmentBetweenPoints(firstPoint, secondPoint);
        double secondSide = diag*Math.sin((90-angle)*Math.PI/180);
        return secondSide;
    }

    // метод для расчета площади прямоугольника
    @Override
    public float getArea(){
        //double area = Math.pow(getDiagonal(), 2)/2*Math.sin(angle*Math.PI/180);
        double area = getFirstSide()*getSecondSide();
        return (float)area;
    }
    
    // метод для расчета периметра прямоугольника
    @Override
    public float getPerimeter(){
        double perimetr = (getFirstSide()+getSecondSide())*2;
        return (float)perimetr;
    }
    
    @Override
    public String toString() {
        return "Прямоугольник (площадь = " + getArea() + ", периметр = " + getPerimeter() + ')';
    }
    
}
