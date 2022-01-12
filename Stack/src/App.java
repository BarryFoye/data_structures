public class App {
    public static void main(String[] args) throws Exception {
        Runner run = new Runner();
        System.out.println("Running isValid:  /////////////////////////////////////////////////////////////////");
        isValid(run);
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");

        System.out.println("Running reverseList:  /////////////////////////////////////////////////////////////////");
        reverseList(run);
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
    }

    public static void reverseList(Runner run) {
        ListNode result = run.reverseList(run.getList());
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static void isValid(Runner run) {
        System.out.println("Expected: TRUE ////////////////////////////////////////////////////////////////////");
        System.out.println(run.isValidAlt("()"));
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Expected: TRUE ////////////////////////////////////////////////////////////////////");
        System.out.println(run.isValidAlt("()[]{}"));
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Expected: FALSE ///////////////////////////////////////////////////////////////////");
        System.out.println(run.isValidAlt("(]"));
    }
}
