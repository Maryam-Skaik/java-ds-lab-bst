package activities;

/**
 * Activity 1: Find Minimum and Maximum values in a BST
 * 
 * This class demonstrates how to find the minimum and maximum values in a Binary Search Tree.
 * In a BST:
 * - Minimum value is always in the leftmost node
 * - Maximum value is always in the rightmost node
 */
public class FindMinMax<T> {

    // Node class for BST
    public static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Find minimum value in BST
    public T findMin(Node<T> root) {
        if (root == null) return null;

        // traverse left until the last node
        while (root.left != null)
            root = root.left;

        return root.data;
    }

    // Find maximum value in BST
    public T findMax(Node<T> root) {
        if (root == null) return null;

        // traverse right until the last node
        while (root.right != null)
            root = root.right;

        return root.data;
    }

    // Example usage
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(7);
        root.left = new Node<>(3);
        root.right = new Node<>(11);
        root.left.left = new Node<>(1);
        root.right.right = new Node<>(15);

        FindMinMax<Integer> bstUtil = new FindMinMax<>();

        System.out.println("Min value: " + bstUtil.findMin(root)); // 1
        System.out.println("Max value: " + bstUtil.findMax(root)); // 15
    }
}
