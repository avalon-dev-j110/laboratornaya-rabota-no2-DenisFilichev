package ru.avalon.java.dev.j10.labs.shapes;

public interface Point {
    // setX и setY добавлены в интерфейс для предоставления возможности изменять координаты существующих точек
    void setX(int x);
    void setY(int y);
    int getX();
    int getY();
}
