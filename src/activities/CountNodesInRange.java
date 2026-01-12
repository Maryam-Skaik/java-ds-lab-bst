package activities;

/**
 * Activity 3: Count Nodes in a Given Range
 * 
 * Counts the number of nodes in a BST whose values lie within a given range [left, right].
 * Optimized to skip subtrees that are entirely outside the range.
 */
public class CountNodesInRange {

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int countNodes(Node root, int left, int right) {
        if (root == null) return 0;

        // if node is less than range, skip left subtree
        if (root.data < left) return countNodes(root.right, left, right);

        // if node is greater than range, skip right subtree
        if (root.data > right) return countNodes(root.left, left, right);

        // current node is in range, count it + recurse both sides
        return 1 + countNodes(root.left, left, right) + countNodes(root.right, left, right);
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(11);
        root.left.left = new Node(1);
        root.right.right = new Node(15);

        CountNodesInRange counter = new CountNodesInRange();
        System.out.println("Nodes in range [3, 12]: " + counter.countNodes(root, 3, 12)); // 3 nodes
    }
}
