
package ru.avalon.java.dev.j10.labs.shapes;

public class SegmentBetweenPoints {
    static double segmentBetweenPoints (Point point1, Point point2){
        double segment = Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2));
        return segment;
    }
}
