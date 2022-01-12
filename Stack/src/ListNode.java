public class ListNode {

    // Definition for singly-linked list.
    String name;
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x, String name) {
        this.name = name;
        this.val = x;
        this.next = null;
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
