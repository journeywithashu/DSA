import java.util.*;
public class LinkedHashmap {
     public static void main(String[] args) {
         LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();
         lhm.put("India",100);
         lhm.put("USA",30);
         lhm.put("China",150);
         System.out.println(lhm);

          HashMap<String,Integer>hm = new HashMap<>();
         hm.put("India",100);
         hm.put("USA",30);
         hm.put("China",150);
         System.out.println(hm);

     }

}
