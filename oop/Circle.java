package oop;

public class Circle {
    private double radius;
    private String color;
    private static final double PI = 3.142;

    public Circle(){
        this.radius = 1.0;
        this.color = "blue";
    }
    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        //return getRadius()*getRadius()* PI;
        return Math.pow(getRadius(),2)*PI;
    }
    public void setRadius(double r){
        this.radius = r; 
    }
    public void setColor(String color){
        this.color = color;
    } 
    public static void main(String[]args){
        Circle myCircle = new Circle();
        myCircle.setRadius(5.0);
        Circle myCirclee = new Circle(2.0);
        myCirclee.setRadius(6.0);
        myCircle.setColor("green");
        System.out.println("The circle has radius of " +myCirclee.getRadius() +" and the area of " + myCirclee.getArea());
        System.out.println("The circle has radius of " +myCircle.getRadius() +" and the area of " + myCircle.getArea());
        System.out.println("The circle has color of " +myCircle.getColor() +" and the area of " + myCircle.getArea());
    }

}
