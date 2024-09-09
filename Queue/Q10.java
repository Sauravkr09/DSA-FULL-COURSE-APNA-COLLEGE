import java.util.*;
public class Q10 {
    static class Job {
        char job_id;
        int deadline;
        int profit;

        public Job(char job_id, int deadline, int profit) {
            this.job_id = job_id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static void printJobScheduling(ArrayList<Job> arr) {
        int n = arr.size();
        Collections.sort(arr, (a, b) -> b.profit - a.profit);
        boolean[] result = new boolean[n];
        char[] job = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, arr.get(i).deadline) - 1; j >= 0; j--) {
                if (!result[j]) {
                    result[j] = true;
                    job[j] = arr.get(i).job_id;
                    break;
                }
            }
        }

        for (char jb : job) {
            if (jb != 0) {
                System.out.print(jb + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));

        System.out.println("Following is the maximum profit sequence of jobs:");
        printJobScheduling(arr);
    }
}
