import java.util.*;
public class Q8 {
    static void generatePrintBinary(int n) {
        // Initialize a queue of strings
        Queue<String> q = new LinkedList<>();

        // Start with the first binary number "1"
        q.add("1");

        // Loop n times to generate binary numbers
        while (n-- > 0) {
            // Get the front of the queue
            String s1 = q.peek();
            q.remove();  // Remove it from the queue

            // Print the current binary number
            System.out.println(s1);

            // Generate the next two binary numbers
            String s2 = s1;  // Copy the current string
            q.add(s1 + "0"); // Append "0"
            q.add(s2 + "1"); // Append "1"
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number of binary numbers to generate
        generatePrintBinary(n); // Call the function to print binary numbers
    }
}  

