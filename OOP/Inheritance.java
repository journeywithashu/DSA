



public class Inheritance {
     public static void main(String[] args) {
          
         
     }
}
//base class
class Animal{
     String color;
     void eat(){
          System.out.println("eats");
     }
     void breathe(){
          System.out.println("breathes");
     }
}
class Mammal extends Animal{
    void walk(){
     System.out.println("walk");
    }
}
class Fish extends Animal{
     void swim(){
     System.out.println("Swim");
     }
}
class Bird extends Animal{
     void fly(){
          System.out.println("Fly");
     }
}
//Derived class
// class Fish extends Animal{
//      int fins;
//      void swim(){
//           System.out.println("swim");
//      }
//}