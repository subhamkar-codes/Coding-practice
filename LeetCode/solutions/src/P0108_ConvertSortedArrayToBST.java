
import java.util.*;

class TreeNode108 {
    int val;
    TreeNode108 left;
    TreeNode108 right;

    TreeNode108(int val) {
        this.val = val;
    }
}

class Solution108 {
    public TreeNode108 sortedArrayToBST(int[] nums) {

        return buildTree(nums,0, nums.length-1);
    }
    private TreeNode108 buildTree(int[] nums, int left, int right) {
        if (left > right){
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode108 root = new TreeNode108(nums[mid]);
        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);
        return root;
    }

}

public class P0108_ConvertSortedArrayToBST {

    static void printInorder(TreeNode108 root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution108 sol = new Solution108();
        TreeNode108 root = sol.sortedArrayToBST(nums);

        System.out.print("Inorder traversal: ");
        printInorder(root);

        sc.close();
    }
}
