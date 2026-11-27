
import java.util.Scanner;

class TreeNode110 {
    int val;
    TreeNode110 left;
    TreeNode110 right;

    TreeNode110(int val) {
        this.val = val;
    }
}

class Solution110 {
    public boolean isBalanced(TreeNode110 root) {
      if (checkHeight(root) == -1){
          return false;
      }
      else {
          return true;
      }
    }
    private int checkHeight(TreeNode110 root){
        if (root == null){
            return 0;
        }
        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1){
            return -1;
        }
        int diff = Math.abs(leftHeight -  rightHeight);
        if (diff>1){
            return -1;
        }
        else {
            return 1+Math.max(leftHeight,rightHeight);
        }

    }
}

public class P0110_BalancedBinaryTree {

    static Scanner sc = new Scanner(System.in);

    static TreeNode110 buildTree() {
        int value = sc.nextInt();

        if (value == -1) return null;

        TreeNode110 root = new TreeNode110(value);

        root.left = buildTree();
        root.right = buildTree();

        return root;
    }

    public static void main(String[] args) {
        System.out.println("Enter preorder values (-1 for null):");

        TreeNode110 root = buildTree();

        Solution110 sol = new Solution110();

        System.out.println("Is Balanced: " + sol.isBalanced(root));

        sc.close();
    }
}
