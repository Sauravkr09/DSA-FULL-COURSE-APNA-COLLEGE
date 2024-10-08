package Hashing;
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
      HashMap<String, Integer> map = new HashMap<>();  
      map.put("India", 100);
      map.put("Usa", 50);
      map.put("china", 150);
      map.put("Nepal", 8);
      map.put("Indonesia", 6);

      //Iterate
      Set<String> keys = map.keySet();
      System.out.println(keys);

      for (String k: keys) {
        System.out.println("key="+k+ ",value="+map.get(k));
        
      }
    }
}
