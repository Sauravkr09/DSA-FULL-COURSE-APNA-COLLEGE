import java.util.*;

public class Iteration {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();  // Changed HashMap to HashSet
        cities.add("Patna");
        cities.add("Delhi");
        cities.add("Goa");  // Corrected 'Gao' to 'Goa'
        cities.add("Noida");

        // Iterator<String> it = cities.iterator();  // Parameterized Iterator
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String city : cities){
            System.out.println(city);
        }


    }
}
