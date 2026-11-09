import java.util.Scanner;

// LeetCode solution

class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Handle empty lists
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        // Select the first node
        ListNode head;

        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        // Keep track of the last node
        ListNode tail = head;

        // Merge while both lists have nodes
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }

        // Attach the remaining nodes
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return head;
    }
}




class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Your testing class
public class P0021_MergeTwoSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}