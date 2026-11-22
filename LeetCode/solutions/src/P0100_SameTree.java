
import java.util.Scanner;

class TreeNode100 {
    int val;
    TreeNode100 left;
    TreeNode100 right;

    TreeNode100() {}

    TreeNode100(int val) {
        this.val = val;
    }

    TreeNode100(int val, TreeNode100 left, TreeNode100 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution100 {
    public boolean isSameTree(TreeNode100 p, TreeNode100 q) {

        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}

public class P0100_SameTree {

    static Scanner sc = new Scanner(System.in);

    static TreeNode100 buildTree() {
        System.out.print("Enter node value (-1 for null): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        TreeNode100 root = new TreeNode100(value);

        System.out.println("Left child of " + value);
        root.left = buildTree();

        System.out.println("Right child of " + value);
        root.right = buildTree();

        return root;
    }

    public static void main(String[] args) {

        System.out.println("Build Tree P:");
        TreeNode100 p = buildTree();

        System.out.println("\nBuild Tree Q:");
        TreeNode100 q = buildTree();

        Solution100 sol = new Solution100();

        boolean result = sol.isSameTree(p, q);

        System.out.println("\nAre both trees identical? " + result);

        sc.close();
    }
}
