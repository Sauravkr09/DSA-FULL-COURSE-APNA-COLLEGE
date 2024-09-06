import java.util.*;

public class Trapping {
    public static int maxWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int pop_height = height[stack.pop()];

                if (stack.isEmpty()) {
                    break;
                }

                int distance = i - stack.peek() - 1;
                int bounded_height = Math.min(height[stack.peek()], height[i]) - pop_height;

                if (bounded_height > 0) {  // Add this condition to avoid over-counting
                    ans += distance * bounded_height;
                }
            }
            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {7, 0 ,4 ,2 ,5 ,0 ,6, 4 ,0, 6 };
        System.out.print(maxWater(arr)); // Expected output: 25
    }
}
