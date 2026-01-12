package activities;

/**
 * Activity 4: Convert Sorted Array to Balanced BST
 * 
 * Converts a sorted array into a height-balanced BST.
 * Middle element becomes root to ensure balance.
 */
public class SortedArrayToBST {

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node buildBST(int[] arr, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        Node root = new Node(arr[mid]);

        // recursively build left and right subtrees
        root.left = buildBST(arr, left, mid - 1);
        root.right = buildBST(arr, mid + 1, right);

        return root;
    }

    // Inorder traversal to verify BST
    public void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 15};
        SortedArrayToBST builder = new SortedArrayToBST();
        Node root = builder.buildBST(arr, 0, arr.length - 1);

        System.out.print("Inorder traversal of BST: ");
        builder.inorderTraversal(root); // should print sorted array
    }
}
