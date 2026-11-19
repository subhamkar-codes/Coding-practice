
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current;
        current = head;

        while (current != null && current.next != null){
            if (current.val == current.next.val){
                current.next = current.next.next;

            }
            else {
                current = current.next;
            }
        }
            return head;
    }
}

public class P0083_RemoveDuplicatesFromSortedList {

    // Create linked list from array
    static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Print linked list
    static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted node values:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ListNode head = createList(arr);

        System.out.println("\nOriginal List:");
        printList(head);

        Solution83 sol = new Solution83();

        ListNode result = sol.deleteDuplicates(head);

        System.out.println("\nAfter Removing Duplicates:");
        printList(result);

        sc.close();
    }
}
