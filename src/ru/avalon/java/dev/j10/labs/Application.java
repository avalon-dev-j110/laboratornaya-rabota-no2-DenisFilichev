package ru.avalon.java.dev.j10.labs;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.*;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Random rand = new Random();
        // Инициализируем массив фигурами
        shapes[0] = new Circle(new PointOfShape(rand.nextInt(50),rand.nextInt(50)), new PointOfShape(rand.nextInt(50),rand.nextInt(50)));
        System.out.println("Фигура №1 " + shapes[0].toString());
        System.out.println();
        shapes[1] = new Rectangle(new PointOfShape(rand.nextInt(50),rand.nextInt(50)), new PointOfShape(rand.nextInt(50),rand.nextInt(50)), rand.nextInt(48)+1);
        System.out.println("Фигура №2 " + shapes[1].toString());
        System.out.println();
        shapes[2] = new Triangle(new PointOfShape(rand.nextInt(50),rand.nextInt(50)), new PointOfShape(rand.nextInt(50),rand.nextInt(50)), new PointOfShape(rand.nextInt(50),rand.nextInt(50)));
        System.out.println("Фигура №3 " + shapes[2].toString());
        System.out.println();
        for (int i=3; i<10; ++i){
            int randShape = rand.nextInt(3);
            switch (randShape){
                case 0: shapes[i]=new Circle(new PointOfShape(rand.nextInt(50),rand.nextInt(50)), new PointOfShape(rand.nextInt(50),rand.nextInt(50)));
                    break;
                case 1: shapes[i]=new Rectangle(new PointOfShape(rand.nextInt(50),rand.nextInt(50)), new PointOfShape(rand.nextInt(50),rand.nextInt(50)), rand.nextInt(48)+1);
                    break;
                case 2: shapes[i]=new Triangle(new PointOfShape(rand.nextInt(50),rand.nextInt(50)), new PointOfShape(rand.nextInt(50),rand.nextInt(50)), new PointOfShape(rand.nextInt(50),rand.nextInt(50)));
            }
            System.out.println("Фигура №" + (i+1) + " " + shapes[i].toString()); // Выводим параметры фигуры
            System.out.println();
        }

        System.out.println("Фигура с максимальной площадью = " + maxArea(shapes)); // Выводим максимальную площадь
    }
    
    //Статический метод для нахождения максимальной площади
    private static Shape maxArea(Shape[] shapes){
        if(shapes==null){return null;}
        if(shapes.length==0){return null;}
        Shape maxArea = shapes[0];
        for (int i=1; i<shapes.length; ++i){
            maxArea = maxArea.getArea()>shapes[i].getArea() ? maxArea:shapes[i];
        }
        return maxArea;
    }
}
