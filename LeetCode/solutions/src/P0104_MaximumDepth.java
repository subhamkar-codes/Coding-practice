
import java.util.Scanner;

class TreeNode104 {
    int val;
    TreeNode104 left;
    TreeNode104 right;

    TreeNode104(int val) {
        this.val = val;
    }
}

class Solution104 {
    public int maxDepth(TreeNode104 root) {
        if (root ==  null){
            return 0;
        }
       int l = maxDepth(root.left);
       int r =  maxDepth(root.right);
        return 1 + Math.max(l,r);
    }
}

public class P0104_MaximumDepth {

    static Scanner sc = new Scanner(System.in);

    static TreeNode104 buildTree() {
        System.out.print("Enter node value (-1 for null): ");
        int value = sc.nextInt();

        if (value == -1) return null;

        TreeNode104 root = new TreeNode104(value);

        System.out.println("Left child of " + value);
        root.left = buildTree();

        System.out.println("Right child of " + value);
        root.right = buildTree();

        return root;
    }

    public static void main(String[] args) {
        System.out.println("Build Binary Tree:");
        TreeNode104 root = buildTree();

        Solution104 sol = new Solution104();

        System.out.println("Maximum Depth: " + sol.maxDepth(root));

        sc.close();
    }
}
