public class Abstract {
     public static void main(String[] args) {
     Mustang myHorse = new Mustang();
      //Animal -> Horse -> Mustang
     }
}
abstract class Animal{
     String Color;

    public Animal() {
     System.out.println("animal constructor Called");

    }
     void eat(){
          System.out.println("animals eats");
     }
     abstract void walk();
}
class Horse extends Animal{

    public Horse() {
     System.out.println("Horse constructor called");
    }
     
     void changeColor(){
          Color = "dark brown";
     }
     void walk(){
          System.out.println("walk 4 legs");
     }
}
class Mustang extends Horse{

    public Mustang() {
         System.out.println("Mustang constructor called");
}
     
}
class Chicken extends Animal{
      void changeColor(){
          Color = "WHITE";
     }
     void walk(){
          System.out.println("walked on 2 legs");
     }
}