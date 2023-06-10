package oop;
// a class within a class, the purpose of nested classes is to group classes that belongs together.
class OuterClass{
    int x = 10;
    class InerClass{
        int y = 5;
    }
}

public class InnerClass {
    public static void main(String[]args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InerClass myIner = myOuter.new InerClass();
        System.out.println(myIner.y + myOuter.x);
    }
}
