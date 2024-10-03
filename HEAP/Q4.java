import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q4 {
    static int minops(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.size(); i++) {
            pq.add(-nums.get(i)); // Using negative values for max heap behavior
        }

        double temp = sum;
        int cnt = 0;
        while (temp > sum / 2) {
            int x = -pq.peek(); // Get the maximum element
            pq.remove(); // Remove the maximum element
            temp -= Math.ceil(x * 1.0 / 2); // Reduce the total sum
            pq.add(x / 2); // Add the halved value back to the heap
            cnt++; // Increment the operation count
        }

        return cnt;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(5);
        nums.add(20);
        nums.add(15);

        int result = minops(nums);
        System.out.println(result); // Output the minimum operations needed
    }
}

// output is 4 copy me likhna hain

