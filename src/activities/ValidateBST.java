package activities;

/**
 * Activity 2: Validate Binary Search Tree
 * 
 * Checks if a binary tree satisfies BST properties:
 * - All nodes in left subtree < current node
 * - All nodes in right subtree > current node
 * Uses recursion with min/max bounds to verify each node.
 */
public class ValidateBST {

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Validate BST using min/max range for each node
    public boolean validateBST(Node root, int min, int max) {
        if (root == null) return true; // empty tree is valid

        if (root.data < min || root.data > max) return false;

        // recursively check left and right subtrees
        return validateBST(root.left, min, root.data - 1)
                && validateBST(root.right, root.data + 1, max);
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(11);
        root.left.left = new Node(1);
        root.right.right = new Node(15);

        ValidateBST validator = new ValidateBST();
        System.out.println("Is BST? " + validator.validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
