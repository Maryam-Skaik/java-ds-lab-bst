package assignment_solutions;

import java.util.*;

/**
 * Problem:
 * Merge two BSTs into a single balanced BST.
 *
 * Approach:
 * 1. Convert both BSTs to sorted lists (in-order traversal)
 * 2. Merge the two sorted lists
 * 3. Build a balanced BST from the merged list recursively
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */
public class MergeBalancedBSTs {

    public Node<Integer> mergeBSTs(Node<Integer> root1, Node<Integer> root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorderList(root1, list1);
        inorderList(root2, list2);

        List<Integer> merged = mergeLists(list1, list2);
        return buildBalancedBST(merged, 0, merged.size() - 1);
    }

    private void inorderList(Node<Integer> node, List<Integer> list) {
        if (node == null) return;
        inorderList(node.left, list);
        list.add(node.data);
        inorderList(node.right, list);
    }

    private List<Integer> mergeLists(List<Integer> l1, List<Integer> l2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) merged.add(l1.get(i++));
            else merged.add(l2.get(j++));
        }
        while (i < l1.size()) merged.add(l1.get(i++));
        while (j < l2.size()) merged.add(l2.get(j++));
        return merged;
    }

    private Node<Integer> buildBalancedBST(List<Integer> arr, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        Node<Integer> node = new Node<>(arr.get(mid));
        node.left = buildBalancedBST(arr, left, mid - 1);
        node.right = buildBalancedBST(arr, mid + 1, right);
        return node;
    }
}
