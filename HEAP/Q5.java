import java.util.PriorityQueue;
import java.util.Comparator;

public class Q5 {
    static class Node { // Changed to static class
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    static class NodeComparator implements Comparator<Node> { // Changed to static class
        public int compare(Node k1, Node k2) {
            return Integer.compare(k1.data, k2.data);
        }
    }

    static Node mergeKList(Node[] arr, int K) {
        PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());
        Node head = new Node(0); // Dummy node
        Node last = head;

        for (int i = 0; i < K; i++) {
            if (arr[i] != null) {
                queue.add(arr[i]);
            }
        }

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            last.next = curr;
            last = last.next;

            if (curr.next != null) {
                queue.add(curr.next);
            }
        }

        return head.next; // Return the merged list, skipping the dummy node
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        int N = 3;
        Node[] a = new Node[N];

        Node head1 = new Node(1);
        a[0] = head1;
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        Node head2 = new Node(2);
        a[1] = head2;
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        Node head3 = new Node(0);
        a[2] = head3;
        head3.next = new Node(9);
        head3.next.next = new Node(10);
        head3.next.next.next = new Node(11);

        Node res = mergeKList(a, N);
        
        if (res != null) {
            printList(res);
        }
        System.out.println(); // Print a new line after the merged list
    }
}

  // output is 0 1 2 3 4 5 6 7 8 9 10 11  copy me likhna hai 
