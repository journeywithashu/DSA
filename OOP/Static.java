public class Static {
     public static void main(String[] args) {
         Student s1 = new Student();
         s1.schoolName = "MVM";

         Student s2 = new Student();
         System.out.println(s2.schoolName);
         Student s3 = new Student();
         s3.schoolName = "ABC";
     }

}
class Student{
    static  int returnPercentage(int math,int phy,int chem){
          return (math + phy + chem)/3;
     }
     String name;
     int roll;

     static  String schoolName;

     void getName(String name){
          this.name = name;
     }
     String getName(){
          return this.name;
     }
}