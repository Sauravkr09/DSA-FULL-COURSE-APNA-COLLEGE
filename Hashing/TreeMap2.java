import java.util.*;

public class TreeMap2 {
    public static void main(String[] args) {
        // LinkedHashMap with key-value pairs
        java.util.LinkedHashMap<String, Integer> tm = new java.util.LinkedHashMap<>();
        tm.put("India", 1);  // Correct usage: add key-value pairs
        tm.put("China", 2);
        tm.put("US", 3); 
        System.out.println(tm);

        // LinkedHashSet to store unique elements
        LinkedHashSet<String> hm = new LinkedHashSet<>();
        hm.add("India");
        hm.add("USA");  
        hm.add("Nepal");  
        System.out.println(hm);

        // TreeSet to store unique elements in a sorted manner
        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("USA");  
        ts.add("Nepal");  
        System.out.println(ts);
    }
}
