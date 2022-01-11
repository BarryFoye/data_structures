import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Runner {
    Random rand = new Random();
    ListNode list1;
    ListNode list2;
    ListNode list3;
    ListNode list4;
    ListNode list5;
    ListNode list6;
    ListNode list7;
    ListNode list8;
    ListNode list9;

    ListNode list10;

    public Runner() {
        list1 = new ListNode(1, "list1");
        list2 = new ListNode(1, "list2");
        list3 = new ListNode(2, "list3");
        list4 = new ListNode(2, "list4");
        list5 = new ListNode(3, "list5");
        list6 = new ListNode(3, "list6");
        list7 = new ListNode(3, "list7");
        list8 = new ListNode(4, "list8");
        list9 = new ListNode(4, "list9");
        list10 = new ListNode(5, "list10");
        setNext();
    }

    public void setNext() {
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = list6;
        list6.next = list7;
        list7.next = list8;
        list8.next = list9;
        list9.next = list10;
    }

    public ListNode deleteDuplicatesAgain(ListNode head) {
        if (head == null)
            return head;

        ListNode sentinal = new ListNode(0, head);
        ListNode answer = sentinal;
        ListNode previous = sentinal;

        while (head != null && head.next != null) {

            if (head.val != head.next.val) {
                previous = head;
                head = head.next;
            } else {
                while (head.val == head.next.val) {
                    head.next = head.next.next;
                }
                previous.next = head.next;
                head = previous;
            }
        }
        while (answer != null) {
            System.out.println(answer.val);
            answer = answer.next;
        }
        return sentinal.next;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        var answer = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        while (answer != null) {
            System.out.println(answer.val);
            answer = answer.next;
        }
        return answer;

    }

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return head;

        Set<ListNode> seen = new HashSet<>();

        while (head != null) {
            if (seen.contains(head))
                return head;
            seen.add(head);
            head = head.next;
        }
        return head;
    }

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        Set<ListNode> seen = new HashSet<>();

        while (head != null) {
            if (seen.contains(head))
                return true;
            seen.add(head);
            head = head.next;
        }
        return false;
    }

    public ListNode getList1() {
        return this.list1;
    }

    public ListNode getList2() {
        return this.list2;
    }

    public ListNode getList3() {
        return this.list3;
    }

    public ListNode getList4() {
        return this.list4;
    }

    public ListNode getList5() {
        return this.list5;
    }

    public ListNode getList6() {
        return this.list6;
    }

    public ListNode getList7() {
        return this.list7;
    }

    public ListNode getList8() {
        return this.list8;
    }

    public ListNode getList9() {
        return this.list9;
    }

    public ListNode getList10() {
        return this.list10;
    }

    public void setNodeNext(ListNode node, ListNode next) {
        node.next = next;
    }
}
