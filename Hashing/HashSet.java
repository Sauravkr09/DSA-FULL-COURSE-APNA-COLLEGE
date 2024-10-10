import java.util.*;
public class HashSet {
    public static void main(String args[]){
        java.util.HashSet<Integer> hs = new java.util.HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        System.out.println(hs);
         

        // hs.remove(2);
        // // Corrected contains() method
        // if (hs.contains(2)) {
        //     System.out.println("set contains 2");
        // }
        hs.clear();
      System.out.println(hs.size() );
      System.out.println(hs.isEmpty() );
    }
}
