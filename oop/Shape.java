package oop;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean field){
        this.color = color;
        this.filled = field;
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
    abstract double getArea();
    abstract double getPerimeter();
}
