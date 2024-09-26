import java.util.*;

public class Question1 {
    static class Node {
        int data;
        Node left, right;
    }

    // Function to create a new Node
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    // Function to check if the tree is a unival tree
    static boolean isUnivalTree(Node root) {
        if (root == null) {
            return true;
        }

        // Check if left child exists and has different value
        if (root.left != null && root.data != root.left.data)
            return false;

        // Check if right child exists and has different value
        if (root.right != null && root.data != root.right.data)
            return false;

        // Recursively check left and right subtrees
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(7);
        root.right.right = newNode(6);

        // Check if the tree is unival
        if (isUnivalTree(root)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
