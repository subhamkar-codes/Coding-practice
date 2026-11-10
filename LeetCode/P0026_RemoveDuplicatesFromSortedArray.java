
import java.util.Scanner;
import java.util.Arrays;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        if (nums.length == 0){
            return 0;
        }

        for (int j = 1; j < nums.length; j++) {
        if (nums[i] != nums[j]){
            i++;
            nums[i] = nums[j];
        }

        }

        return i + 1;
    }
}

public class P0026_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution26 obj = new Solution26();

        int k = obj.removeDuplicates(nums);

        System.out.println("Unique elements: " + k);

        System.out.println("Modified array:");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
