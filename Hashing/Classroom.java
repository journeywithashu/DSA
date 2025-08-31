import java.util.*;
public class Classroom{
     public static void main(String[] args) {
         //create 
       HashMap<String, Integer> hm = new HashMap<>();
       //Insert-O(1)
       hm.put("India", 100);
       hm.put("China",150);
       hm.put("US",50);

       System.out.println(hm);

       //Get - O(1)
       int population = hm.get("India");
       System.out.println(population);

       System.out.println(hm.get("indonasia"));

       //ContainsKey - O(1)
       System.out.println(hm.containsKey("India"));//true
       System.out.println(hm.containsKey("Indonasia"));//false
      
       //Remove - O(1)
       System.out.println(hm.remove("China"));
       System.out.println(hm);

       //Size
       System.out.println(hm.size());

       //Is Empty
       System.out.println(hm.isEmpty());

       //clear
       hm.clear();
       System.out.println(hm);
       System.out.println(hm.isEmpty());
     }
}