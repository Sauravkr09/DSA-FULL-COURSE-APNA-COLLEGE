package Hashing;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        //create 
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("India", 100);
        map.put("Usa", 50);
        map.put("china", 150);
        map.put("Nepal", 8);

        System.out.println(map);

        // //GET - o(1)
        // int population = map.get("India");
        // System.out.println(population);

    //    System.out.println(map.get("Indonesia"));

        // //Contains key - o(1)
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Indonesia"));


        //Remove
        // System.out.println(map.remove("India"));
        // System.out.println(map);

        //Size
        System.out.println(map.size());

        // iSEmpty
        map.clear();
        System.out.println(map.isEmpty());
    }
}
