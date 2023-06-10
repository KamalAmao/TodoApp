package oop;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){
        this.length = 1.0f;
        this.width = 1.0f;
    }
    public Rectangle(float l, float w){
        this.length = l;
        this.width = w;
    }
    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public float getArea(){
        return getLength() * getWidth();
    }
    public static void main(String[]args){
        Rectangle myRect = new Rectangle();
        //myRect.setLengthAndWidth(1.8f, 1.6f);
        Rectangle myRect2 = new Rectangle(2.0f, 3.0f);
        System.out.println("The circle has length and width of " +myRect.getLength()+", "+ myRect.getWidth() +" and the arae of " + myRect.getArea());
        System.out.println("The circle has length and width of " +myRect2.getLength()+" "+ myRect2.getWidth() +" and the arae of " + myRect2.getArea());
    }
}
