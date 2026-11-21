
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        traverse(root, result);

        return result;
    }

    private void traverse(TreeNode root, List<Integer> result) {


        if (root == null) {
            return;
        }

        traverse(root.left, result);

        result.add(root.val);

        traverse(root.right, result);
    }
}

public class P0094_BinaryTreeInorderTraversal {

    static Scanner sc = new Scanner(System.in);

    static TreeNode buildTree() {
        System.out.print("Enter node value (-1 for null): ");
        int value = sc.nextInt();

        if (value == -1) return null;

        TreeNode root = new TreeNode(value);

        System.out.println("Left child of " + value);
        root.left = buildTree();

        System.out.println("Right child of " + value);
        root.right = buildTree();

        return root;
    }

    public static void main(String[] args) {

        TreeNode root = buildTree();

        Solution94 solution = new Solution94();

        List<Integer> result = solution.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + result);
    }
}
