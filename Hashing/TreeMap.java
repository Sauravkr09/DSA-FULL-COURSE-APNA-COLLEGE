import java.util.*;
public class TreeMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String, Integer> tm = new java.util.LinkedHashMap<>();
        tm.put("India", 100);
        tm.put("China", 10);
        tm.put("US", 100);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("USA", 100);  // This will overwrite the previous value (150)
        hm.put("Nepal", 119);  // This will overwrite the previous value (100)

      
        System.out.println(hm);
        System.out.println(tm);
    }
}
