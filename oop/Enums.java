package oop;

public class Enums {
    enum Level{
        Low,
        Medium,
        High,
    }
    public static void main(String[]args){
        Level myLevel = Level.Medium;
        for(Level myLevels : Level.values()){
            System.out.println(myLevels);
        }
        switch (myLevel){
            case Low:
            System.out.println("Low level");
            break;
            case Medium:
            System.out.println("Medium level");
            break;
            case High:
            System.out.println("High level");
            break;
        }
        //System.out.println(myLevel);
    }

}
