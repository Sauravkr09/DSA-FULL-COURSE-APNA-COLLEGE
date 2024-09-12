import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        int m = 4, n = 6;  // Changed the second 'n' to 'm' to avoid redeclaration
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;  // hp and vp should start from 1 to handle the first cut
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);  // Fixed logic, cost should be based on costHor[h] here
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);  // Fixed logic, cost should be based on costVer[v] here
                vp++;
                v++;
            }
        }

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("min cost of cut = " + cost);
    }
}
