import java.util.*;

public class Deque { 
    public static void main(String[] args) {
        java.util.Deque<Integer> deque = new LinkedList<>(); // Fully qualified 'Deque'
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first" + deque.getFirst());
        System.out.println("last" + deque.getLast());
    }
}
