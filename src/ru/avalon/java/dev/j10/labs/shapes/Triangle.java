package ru.avalon.java.dev.j10.labs.shapes;

public class Triangle implements Polygon{

    Point firstPoint; // первая точка (вершина) треугольника
    Point secondPoint;// вторая точка (вершина) треугольника
    Point thirdPoint;// третья точка (вершина) треугольника
    
    /* Прямоугольник строится исходя из двух точек с заданными координатами,
    между которыми проводится отрезок (диагональ прямоугольника),
    и угла между диагональю и одной из сторон прямоугольника*/
    public Triangle (Point firstPoint, Point secondPoint, Point thirdPoint){
       this.firstPoint=firstPoint;
       this.secondPoint=secondPoint;
       this.thirdPoint=thirdPoint;
    }
  
    // метод для расчета площади треугольника
    @Override
    public float getArea(){
        double area = Math.sqrt(getPerimeter()*(getPerimeter()-SegmentBetweenPoints.segmentBetweenPoints(firstPoint, secondPoint))*(getPerimeter()-SegmentBetweenPoints.segmentBetweenPoints(firstPoint, thirdPoint))*(getPerimeter()-SegmentBetweenPoints.segmentBetweenPoints(thirdPoint, secondPoint)));
        
        return (float)area;
    }
    
    // метод для расчета периметра треугольника
    @Override
    public float getPerimeter(){ 
        double perimetr = SegmentBetweenPoints.segmentBetweenPoints(firstPoint, secondPoint)+SegmentBetweenPoints.segmentBetweenPoints(firstPoint, thirdPoint)+SegmentBetweenPoints.segmentBetweenPoints(thirdPoint, secondPoint);
        return (float)perimetr;
    }
    
    @Override
    public String toString() {
        return "Треугольник (площадь = " + getArea() + ", периметр = " + getPerimeter() + ')';
    }
}
