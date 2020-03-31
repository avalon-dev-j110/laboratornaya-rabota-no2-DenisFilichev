package ru.avalon.java.dev.j10.labs;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.*;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Random rand = new Random();
     
        // Инициализируем массив фигурами
        for (int i=0; i<10; ++i){
            int randShape = rand.nextInt(3);
            switch (randShape){
                case 0: shapes[i]=new Circle(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(50));
                    break;
                case 1: shapes[i]=new Rectangle(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(48)+1);
                    break;
                case 2: shapes[i]=new Triangle(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(50));
                    break;
            }
            System.out.println("Фигура №" + (i+1) + " " + shapes[i].toString()); // Выводим параметры фигуры
            System.out.println();
        }

        System.out.println("Фигура с максимальной площадью = " + maxArea(shapes)); // Выводим максимальную площадь
    }
    
    //Статический метод для нахождения максимальной площади
    private static Shape maxArea(Shape[] shapes){
        Shape maxArea = shapes[0];
        for (int i=1; i<shapes.length; ++i){
            maxArea = maxArea.getArea()>shapes[i].getArea() ? maxArea:shapes[i];
        }
        return maxArea;
    }
}
