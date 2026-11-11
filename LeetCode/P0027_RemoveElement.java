
import java.util.Scanner;

class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i  = 0;
        for (int j = 0 ; j < nums.length; j++) {
            if (nums[j]== val){
                continue;
            }
            else {
                nums[i] = nums[j];
                i++;
            }
        }


        return i;
    }
}

public class P0027_RemoveElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Input array elements
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target value
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        // Create Solution object
        Solution27 obj = new Solution27();

        // Call LeetCode method
        int k = obj.removeElement(nums, val);

        // Display result
        System.out.println("k = " + k);
        System.out.print("Modified array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        sc.close();
    }
}
