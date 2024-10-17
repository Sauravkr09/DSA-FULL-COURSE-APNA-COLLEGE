import java.util.*;

public class SubarraySumK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (sum == k) {
                ans++;
            }

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Number of subarrays with sum equal to " + k + " => " + ans);
    }
}
