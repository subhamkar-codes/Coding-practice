import java.util.Scanner;

public class P0001_TwoSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean found = false;
        for (int i = 0; i < arr.length && !found; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for (int i = 0; i < arr.length && !found; i++) {
            for (int j = i+1; j < arr.length; j++){

                if (target == arr[i]+arr[j]){
                   found = true;
                    System.out.println("["+i+","+j+"]");
                   break;
                }


            }
        }

    }
}
//--- For Directly Copy and paste in LeetCode ---   

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (target == nums[i] + nums[j]) {
//                    return new int[]{i, j};
//                }
//
//            }
//        }
//
//        return new int[]{};
//    }
//}
