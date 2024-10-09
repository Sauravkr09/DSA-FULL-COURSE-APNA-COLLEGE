import java.util.*;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String, Integer> lhm = new java.util.LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 10);
        lhm.put("US", 100);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("India", 100);  // This will overwrite the previous value (150)
        hm.put("India", 119);  // This will overwrite the previous value (100)

        System.out.println(lhm);
        System.out.println(hm);
    }
}
