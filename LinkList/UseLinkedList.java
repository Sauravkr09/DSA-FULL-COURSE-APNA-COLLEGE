import java.util.LinkedList;
public class UseLinkedList {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //addd 
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
    }
}
