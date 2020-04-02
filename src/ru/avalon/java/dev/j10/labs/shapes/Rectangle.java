package ru.avalon.java.dev.j10.labs.shapes;

public class Rectangle implements Polygon{

    int angle; // угол (в градусах) между диагональю прямоугольника и одной из его сторон
    Point firstPoint; // первая точка диагонали прямоугольника
    Point secondPoint;// вторая точка диагонали прямоугольника
    
    
    /* Прямоугольник строится исходя из двух точек с заданными координатами,
    между которыми проводится отрезок (диагональ прямоугольника),
    и угла между диагональю и одной из сторон прямоугольника*/
    public Rectangle (Point firstPoint, Point secondPoint, int angle){
        this.firstPoint=firstPoint;
        this.secondPoint=secondPoint;
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
