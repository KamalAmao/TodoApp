package oop;

// polymorphism occurs when we have many class that are related to eachother by inheritance
class Animal{
    public void animalSound(){
   System.out.println("Animal makes a sound");
    }
}
class Pig extends Animal{
    public void animalSound(){
   System.out.println("Pig wee");
}
}
class Dog extends Animal{
public void animalSound(){
   System.out.println("Dog barks");
}
}    

public class Polymorphism{
    public static void main(String[]args){
    
        Animal myAnimal = new Animal();
        Pig myPig = new Pig();
        Dog myDog = new Dog();
    
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }    
}

 
