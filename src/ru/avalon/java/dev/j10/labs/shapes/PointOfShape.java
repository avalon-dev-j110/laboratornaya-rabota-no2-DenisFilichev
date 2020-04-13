
package ru.avalon.java.dev.j10.labs.shapes;

public class PointOfShape implements Point{
    private int x, y;
    
    public PointOfShape(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public int getX (){
        return x;
    }
    
    public int getY (){
        return y;
    }
}
