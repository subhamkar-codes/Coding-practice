
import java.util.Scanner;

class TreeNode101 {
    int val;
    TreeNode101 left;
    TreeNode101 right;

    TreeNode101() {}

    TreeNode101(int val) {
        this.val = val;
    }

    TreeNode101(int val, TreeNode101 left, TreeNode101 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution101 {
   public boolean isMirror(TreeNode101 left,TreeNode101 right){
        if (left == null && right == null){
            return true;
        } else if (left == null || right == null) {
            return  false;
        } else if (left.val != right.val) {
            return false;
        }
        return isMirror(right.right , left.left) && isMirror(right.left , left.right);
   }

    public boolean isSymmetric(TreeNode101 root) {
            if (root == null){
                return true;
            }



        return isMirror(root.right , root.left);
    }
}

public class P0101_SymmetricTree {

    static Scanner sc = new Scanner(System.in);

    static TreeNode101 buildTree() {
        System.out.print("Enter node value (-1 for null): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        TreeNode101 root = new TreeNode101(value);

        System.out.println("Left child of " + value);
        root.left = buildTree();

        System.out.println("Right child of " + value);
        root.right = buildTree();

        return root;
    }

    public static void main(String[] args) {

        System.out.println("Build Binary Tree:");
        TreeNode101 root = buildTree();

        Solution101 sol = new Solution101();

        boolean result = sol.isSymmetric(root);

        System.out.println("\nIs the tree symmetric? " + result);

        sc.close();
    }
}
