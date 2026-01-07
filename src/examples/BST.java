package bst;

/**
 * Binary Search Tree (BST) implementation.
 * 
 * @param <T> Generic type (used as Integer in this implementation)
 */
public class BST<T> {

    /**
     * Root node of the BST.
     * Initially null when tree is empty.
     */
    private Node<T> root;

    /**
     * BST Node definition.
     * Each node contains:
     * - data
     * - left child
     * - right child
     */
    public static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        /**
         * Creates a node with given data.
         */
        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Default constructor: creates an empty BST.
     */
    public BST() {
        this.root = null;
    }

    /**
     * Constructor with predefined root node.
     */
    public BST(Node root) {
        this.root = root;
    }

    /**
     * Returns the root of the BST.
     */
    public Node getRoot() {
        return root;
    }

    // ================= INSERT =================

    /**
     * Inserts a new element into the BST.
     * 
     * @param root current subtree root
     * @param element value to insert
     * @return updated subtree root
     */
    public Node insert(Node root, T element) {

        // Base case: found empty position
        if (root == null)
            return new Node(element);

        // If element is smaller, go left
        if ((Integer) element < (Integer) root.data) {
            root.left = insert(root.left, element);
        } 
        // Otherwise, go right
        else {
            root.right = insert(root.right, element);
        }

        return root;
    }

    // ================= SEARCH =================

    /**
     * Searches for an element in the BST.
     * 
     * @param root current subtree root
     * @param element value to search
     * @return true if found, false otherwise
     */
    public boolean search(Node root, T element) {

        // Element not found
        if (root == null)
            return false;

        // Element found
        if ((Integer) element == (Integer) root.data)
            return true;

        // Search left or right subtree
        if ((Integer) element < (Integer) root.data)
            return search(root.left, element);
        else
            return search(root.right, element);
    }

    // ================= DELETE =================

    /**
     * Deletes a node from the BST.
     * 
     * @param root current subtree root
     * @param element value to delete
     * @return updated subtree root
     */
    public Node delete(Node root, T element) {

        if (root == null)
            return null;

        // Traverse to correct node
        if ((Integer) element < (Integer) root.data) {
            root.left = delete(root.left, element);
        } 
        else if ((Integer) element > (Integer) root.data) {
            root.right = delete(root.right, element);
        } 
        else {

            // Case 1: No children
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: Two children
            // Find inorder successor (min in right subtree)
            Node<T> min = root.right;
            while (min.left != null)
                min = min.left;

            // Replace value
            root.data = min.data;

            // Delete successor
            root.right = delete(root.right, min.data);
        }

        return root;
    }

    // ================= INORDER =================

    /**
     * Inorder traversal of BST.
     * Prints values in sorted order.
     */
    public void inorderTraversal(Node root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        BST<Integer> bst = new BST(new Node(7));

        bst.insert(bst.getRoot(), 11);
        bst.insert(bst.getRoot(), 5);
        bst.insert(bst.getRoot(), 8);
        bst.insert(bst.getRoot(), 3);

        bst.inorderTraversal(bst.getRoot());
        System.out.println();

        bst.delete(bst.getRoot(), 7);

        System.out.println("After Deletion:");
        bst.inorderTraversal(bst.getRoot());
    }
}
