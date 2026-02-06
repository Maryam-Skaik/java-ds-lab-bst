package assignment_solutions;

import java.util.Stack;

/**
 * Problem:
 * Check if a given preorder traversal array represents a valid BST.
 *
 * Approach:
 * - Use a stack to track ancestors.
 * - Keep a lower bound for the current node.
 * - For each element:
 *   - If it is smaller than lower bound → invalid
 *   - Pop ancestors smaller than current → update lower bound
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) – stack
 */
public class ValidBSTPreorder {

    public boolean isValidBSTPreorder(int[] preorder) {
        Stack<Integer> stack = new Stack<>();
        int lower = Integer.MIN_VALUE;

        for (int val : preorder) {
            if (val < lower) return false;

            while (!stack.isEmpty() && val > stack.peek()) {
                lower = stack.pop();
            }

            stack.push(val);
        }
        return true;
    }
}
