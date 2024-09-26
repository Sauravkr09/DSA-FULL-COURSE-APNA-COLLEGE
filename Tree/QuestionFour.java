import java.util.*;

public class QuestionFour {
    static HashMap<String, Integer> m;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static String inorder(Node node) {
        if (node == null)
            return "";

        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";

        m.put(str, m.getOrDefault(str, 0) + 1);

        if (m.get(str) == 2) {
            System.out.print(node.data + " ");
        }

        return str;
    }

    static void printAllDups(Node root) {
        m = new HashMap<>();
        inorder(root);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);

        printAllDups(root);
    }
}
