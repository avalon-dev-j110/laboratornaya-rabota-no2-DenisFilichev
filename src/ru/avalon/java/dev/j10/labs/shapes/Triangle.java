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
public class Triangle implements Polygon{

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    PointOfShape firstPoint = new PointOfShape(); // первая точка (вершина) треугольника
    PointOfShape secondPoint = new PointOfShape();// вторая точка (вершина) треугольника
    PointOfShape thirdPoint = new PointOfShape();// третья точка (вершина) треугольника
    
    /* Прямоугольник строится исходя из двух точек с заданными координатами,
    между которыми проводится отрезок (диагональ прямоугольника),
    и угла между диагональю и одной из сторон прямоугольника*/
    public Triangle (int firstX, int firstY, int secondX, int secondY, int thirdX, int thirdY){
        firstPoint.setX(firstX); // координата первой точки ппо оси X
        firstPoint.setY(firstY); // координата первой точки ппо оси Y
        secondPoint.setX(secondX); // координата второй точки ппо оси X
        secondPoint.setY(secondY); // координата второй точки ппо оси Y
        thirdPoint.setX(thirdX); // координата третьей точки ппо оси X
        thirdPoint.setY(thirdY); // координата третьей точки ппо оси Y
    }
    
    
    
    // метод для расчета площади треугольника
    @Override
    public float getArea(){
        //float per = (side1+side2+side2)/2;
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
