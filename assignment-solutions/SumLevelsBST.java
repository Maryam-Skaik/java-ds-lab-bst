package assignment_solutions;

import java.util.*;

/**
 * Problem:
 * Calculate the sum of all node values at each level of the BST.
 *
 * Approach:
 * - Level-order traversal (BFS) using a queue
 * - Sum values per level
 *
 * Time Complexity: O(n)
 * Space Complexity: O(w) – maximum width of tree
 */
public class SumLevelsBST {

    public List<Integer> sumLevels(Node<Integer> root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                Node<Integer> node = q.poll();
                sum += node.data;
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            result.add(sum);
        }
        return result;
    }
}
