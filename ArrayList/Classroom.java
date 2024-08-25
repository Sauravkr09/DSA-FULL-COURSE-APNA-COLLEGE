
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class Classroom {

    // public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list2 = new ArrayList<>();
    // ArrayList<Boolean> list3 = new ArrayList<>();

    // list.add(1); // O(1)
    // list.add(2);
    // list.add(3);
    // list.add(4);

    // System.out.println(list);

    // Get Operation
    // int element = list.get(2); // O(1)
    // System.out.println(element);

    // Remove element
    // list.remove(2); // O(n) because of shifting
    // System.out.println(list);

    // Set index value
    // list.set(2, 10); // O(n)
    // System.out.println(list);

    // Contain Element
    // System.out.println(list.contains(1));
    // System.out.println(list.contains(11));

    // Size of the list
    // System.out.println(list.size());

    // Print the ArrayList
    // for (int i = 0; i < list.size(); i++) {
    // System.out.print(list.get(i) + " ");
    // }
    // System.out.println();

    // Reverse print the list
    // for (int i = list.size() - 1; i >= 0; i--) {
    // System.out.print(list.get(i) + " ");
    // }
    // System.out.println();

    // Max value in the list
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < list.size(); i++) {
    // if (max < list.get(i)) {
    // max = list.get(i);
    // }
    // }
    // System.out.println("Max element = " + max);

    // Swap 2 numbers

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);

        // // int idx1 = 1, idx2 = 3;
        // // System.out.println(list);

        // // swap(list, idx1, idx2);

        // // System.out.println(list);
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);

        // //descending order
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        // multi dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); list.add(2);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3); list2.add(4);
        // mainList.add(list2);

        // for(int i=0; i<mainList.size(); i++){
        // ArrayList<Integer> currList = mainList.get(i);
        // for(int j=0; j<currList.size(); j++){
        // System.out.print(currList.get(j)+ " ");
        // }
        // System.out.println();
        // }
        // System.out.println(mainList);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
    }
}
