import java.util.Stack;

public class Runner {
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
    ListNode list11;

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
        list11 = new ListNode(5, "list11");
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

    public ListNode getList() {
        list1 = new ListNode(1, "list1");
        list2 = new ListNode(2, "list2");
        list3 = new ListNode(3, "list3");
        list4 = new ListNode(4, "list4");
        list5 = new ListNode(5, "list5");
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = null;
        return list1;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        Stack<ListNode> stack = new Stack<>();
        ListNode reference;
        while (head != null) {
            stack.add(head);
            head = head.next;
            stack.peek().next = null;
        }
        reference = stack.pop();
        head = reference;
        while (!stack.isEmpty()) {
            if (!stack.isEmpty())
                reference.next = stack.pop();
            reference = reference.next;
        }
        return head;
    }

    public boolean isValid(String s) {
        boolean valid = false; // keep track of the string validity
        if (s.length() <= 0 || s.length() >= 10000 || s.length() % 2 != 0) // Constraints (string has characters, is
                                                                           // less than 10k long and has pairs)
            return valid; // false
        // All good lets define variables
        Stack<Character> stack = new Stack<>(); // Use a stack to handle pairs
        char a; // used for each character of the string
        for (int i = 0; i < s.length(); i++) { // Loop through the string
            a = s.charAt(i); // get the next char given an index
            switch (a) { // switch to the correct case
                // cases where the given char is an opening parentheses
                // push to the stack until we find a closing parentheses
                case '(':
                    stack.push(a);
                    valid = true;
                    break;
                case '{':
                    stack.push(a);
                    valid = true;
                    break;
                case '[':
                    stack.push(a);
                    valid = true;
                    break;
                // cases where the given char is a closing parentheses
                case ')':
                    if (stack.isEmpty() || Character.compare(stack.peek(), '(') != 0) {
                        valid = false; // invalid, either the stack is empty, therefore no pairing or the top of the
                                       // stack doesn't have the correct pairing
                    } else {
                        valid = true;
                        stack.pop(); // the pairing was made now remove the top of the stack
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || Character.compare(stack.peek(), '{') != 0) {
                        valid = false;
                    } else {
                        valid = true;
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || Character.compare(stack.peek(), '[') != 0) {
                        valid = false;
                    } else {
                        valid = true;
                        stack.pop();
                    }
                    break;
                default:
                    valid = false; // some crazy nonsense has happened, we should never get here e.g. we have an
                                   // unexpected char value
                    break;
            }

            if (!valid)
                return valid; // iif we have an invalid step processing the string the no need to proceed
                              // further

        }
        if (!stack.empty()) // at this point the stack should be empty otherwise their are opening
                            // parentheses with out a closing match
            valid = false;
        return valid; // finally return the valididity of the result
    }

    public boolean isValidAlt(String s) {
        if (s.length() <= 0 || s.length() >= 10000 || s.length() % 2 != 0)
            return false;
        // All good lets define variables
        Stack<Character> stack = new Stack<>(); // Use a stack to handle pairs
        char a; // used for each character of the string
        for (int i = 0; i < s.length(); i++) { // Loop through the string
            a = s.charAt(i); // get the next char given an index
            switch (a) { // switch to the correct case
                // cases where the given char is an opening parentheses
                // push to the stack until we find a closing parentheses
                case '(':
                    stack.push(a);
                    break;
                case '{':
                    stack.push(a);
                    break;
                case '[':
                    stack.push(a);
                    break;
                // cases where the given char is a closing parentheses
                case ')':
                    if (stack.isEmpty() || Character.compare(stack.peek(), '(') != 0) {
                        return false; // invalid, either the stack is empty, therefore no pairing or the top of the
                                      // stack doesn't have the correct pairing
                    } else {
                        stack.pop(); // the pairing was made now remove the top of the stack
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || Character.compare(stack.peek(), '{') != 0) {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || Character.compare(stack.peek(), '[') != 0) {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                default:
                    return false; // some crazy nonsense has happened, we should never get here e.g. we have an
                                  // unexpected char value
            }
        }
        if (!stack.empty()) // at this point the stack should be empty otherwise their are opening
                            // parentheses with out a closing match
            return false;
        return true; // finally return the valididity of the result
    }
}