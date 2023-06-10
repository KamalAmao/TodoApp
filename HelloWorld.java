public class HelloWorld{
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


    
    public static void main(String[]args){
        
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }    
        System.out.println("Hello world");
    }
