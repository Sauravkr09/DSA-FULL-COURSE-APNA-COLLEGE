import java.util.*;

public class BuySellStock {

    public static int buyAndSellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
   
    // question array solution 
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // Example for buyAndSellStock
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + buyAndSellStock(prices));

        // Example for containsDuplicate
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 5};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }
}