
import java.util.Scanner;
import java.util.Arrays;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        for ( ; i >= 0 && j >= 0; ) {
            if (nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k]  = nums2[j];
                j--;
                k--;
            }

        }
        for (; j >= 0; j--) {
            nums1[k] = nums2[j];
            k--;
        }

    }
}

public class P0088_MergeSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of valid elements in nums1 (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of elements in nums2 (n): ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        Solution88 sol = new Solution88();

        sol.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));

        sc.close();
    }
}
