package Week_10.Block_B;

// Node class
class Node {

    int data;
    Node left;
    Node right;

    // Constructor
    Node(int data) {

        this.data = data;

        left = null;
        right = null;
    }
}

public class Task7 {

    // Preorder Traversal
    public static void preOrder(Node root) {

        // Base condition
        if (root == null) {
            return;
        }

        // 1. Print Root
        System.out.print(root.data + " ");

        // 2. Visit Left subtree
        preOrder(root.left);

        // 3. Visit Right subtree
        preOrder(root.right);
    }

    public static void main(String[] args) {

        // Create the binary tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Print preorder traversal
        System.out.println("Preorder Traversal:");

        preOrder(root);
    }
}