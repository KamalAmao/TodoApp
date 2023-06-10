package oop;

public class Circlee extends Shape {
    protected double radius = 1.0;
    
    public Circlee(double radius){
       this.radius = radius; 
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled; 
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    double getArea(){

    }
    double getPerimeter(){

    }
}


