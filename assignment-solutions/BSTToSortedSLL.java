package assignment_solutions;

/**
 * Problem:
 * Convert a Binary Search Tree (BST) into a sorted Singly Linked List (SLL).
 *
 * Approach:
 * - In-order traversal preserves BST order.
 * - Maintain a 'previous' pointer to link nodes into SLL.
 * - Remove left child references for SLL format.
 *
 * Time Complexity: O(n) – visit each node once
 * Space Complexity: O(h) – recursion stack, h = tree height
 */
public class BSTToSortedSLL {

    public Node<Integer> bstToSortedSLL(Node<Integer> root) {
        if (root == null) return null;
        Node<Integer> dummy = new Node<>(0);
        Node<Integer>[] prev = new Node[]{dummy};
        convertToSLL(root, prev);
        return dummy.right; // head of SLL
    }

    private void convertToSLL(Node<Integer> node, Node<Integer>[] prev) {
        if (node == null) return;

        // Left subtree
        convertToSLL(node.left, prev);

        // Link current node to previous node in SLL
        prev[0].right = node;
        node.left = null; // remove left pointer
        prev[0] = node;

        // Right subtree
        convertToSLL(node.right, prev);
    }
}
