public class Polynorphism {
     public static void main(String[] args) {
          Deer d = new Deer();
          d.eat();
          
     }
}
class Animal{
     void eat(){
          System.out.println("eat anythings");
     }
}
class Deer extends Animal{
     void eat(){
          System.out.println("eat grass");
     }
}
class Calculator{
     int sum(int a, int b){
          return a + b;
     }
     float sum(float a , float b){
          return a + b;
     }
     int sum(int a, int b, int c){
          return a + b + c;
     }
}
