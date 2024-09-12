public class P5 {
    public static int ans = 10000000;

    public static void solve(int a[], int n, int k, int index, int sum, int maxsum) {
        if (k == 1) {
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for (int i = index; i < n; i++) {
                sum += a[i];
            }
            maxsum = Math.max(maxsum, sum);
            ans = Math.min(ans, maxsum);
            return;
        }

        sum = 0;
        for (int i = index; i < n; i++) {
            sum += a[i];
            maxsum = Math.max(maxsum, sum);
            solve(a, n, k - 1, i + 1, sum, maxsum);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 3; // K divisions
        int n = 4; // Size of Array
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans + "\n");
    }
}

//output is 4


/*
 * Time Complexity  : O((N−1)C(K−1))
 * (Here ‘C’ depicts combinations, i.e., ((N-1)! / ((N-K)! * (K-1)!))
 * where N is the number of elements of the array and K is the number of divisions that we are having.)
 * 
 * Space Complexity : O(n)
 */