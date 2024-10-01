import java.util.HashSet;

public class CoinFundraiser {

    public static int countDistinctCoins(int[] coins) {
        HashSet<Integer> distinctCoins = new HashSet<>();
        for (int coin : coins) {
            distinctCoins.add(coin);
        }
        // Calculate the sum of distinct coin values
        int sum = 0;
        for (int coin : distinctCoins) {
            sum += coin;
        }
        return sum;  
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3, 2};  
        
        int result = countDistinctCoins(coins);
        System.out.println("Total sum of distinct coin values: " + result);
    }
}
