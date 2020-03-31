/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

/**
 *
 * @author Denis
 */
public class SegmentBetweenPoints {
    static double segmentBetweenPoints (PointOfShape point1, PointOfShape point2){
        double segment = Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2));
        return segment;
    }
}
