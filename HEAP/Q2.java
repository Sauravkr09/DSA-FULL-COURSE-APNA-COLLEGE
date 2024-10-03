import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static void minTime(int arr[], int N, int K) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[N + 1];
        int time = 0;

        // Initialize the queue and mark the visited nodes
        for (int i = 0; i < K; i++) {
            q.add(arr[i]);
            vis[arr[i]] = true;
        }

        // Process the queue until it's empty
        while (q.size() > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();

                // Check and add the previous element if not visited
                if (curr - 1 >= 1 && !vis[curr - 1]) {
                    vis[curr - 1] = true;
                    q.add(curr - 1);
                }

                // Check and add the next element if not visited
                if (curr + 1 <= N && !vis[curr + 1]) {
                    vis[curr + 1] = true;
                    q.add(curr + 1);
                }
            }
            time++;
        }

        // The time needs to be decremented by 1 since the last increment is unnecessary
        System.out.println(time - 1);
    }

    public static void main(String[] args) {
        int N = 6;
        int arr[] = {2, 6};
        int K = arr.length;

        minTime(arr, N, K);
    }
}

// output is 2 copy me likhna hai
