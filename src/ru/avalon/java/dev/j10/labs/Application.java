package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = null;
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
                
        System.out.println("--------Расчет круга----------");
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Площадь круга = " + circle.getArea());
        System.out.println("Длина окружности = " + circle.getLength());
        
        System.out.println("");
        System.out.println("--------Расчет прямоугольника----------");
        Rectangle rectangle = new Rectangle();
        rectangle.setSide1(2);
        rectangle.setSide2(3);
        System.out.println("Площадь прямоугольника = " + rectangle.getArea());
        System.out.println("Периметр прямоугольника = " + rectangle.getPerimeter());
        
        System.out.println("");
        System.out.println("--------Расчет треугольника----------");
        Triangle triangle = new Triangle();
        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);
        System.out.println("Площадь треугольника = " + triangle.getArea());
        System.out.println("Периметр треугольника = " + triangle.getPerimeter());
    }
}
