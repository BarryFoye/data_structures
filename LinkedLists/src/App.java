public class App {
    public static void main(String[] args) throws Exception {
        Runner run = new Runner();
        System.out.println("*//////////////////////////////////////////////////////////////*");
        System.out.println("*Running Tests*");
        System.out.println("*//////////////////////////////////////////////////////////////*");
        System.out.println();
        System.out.println("*//////////////////////////////////////////////////////////////*");
        System.out.println("*Running Test: Has Cycle*");
        System.out.println("*//////////////////////////////////////////////////////////////*");
        hasCycle(run);
        System.out.println("*//////////////////////////////////////////////////////////////*");
        System.out.println("*Running Test: Detect Cycle*");
        System.out.println("*//////////////////////////////////////////////////////////////*");
        detectCycle(run);
        System.out.println("*//////////////////////////////////////////////////////////////*");
        System.out.println("*Running Test: Delete Duplicates*");
        System.out.println("*//////////////////////////////////////////////////////////////*");
        deleteDuplicates(run);
        System.out.println("*//////////////////////////////////////////////////////////////*");
        System.out.println("*Running Test: Delete Duplicates Again*");
        System.out.println("*//////////////////////////////////////////////////////////////*");
        deleteDuplicatesAgain(run);
        System.out.println("*//////////////////////////////////////////////////////////////*");
        System.out.println("*FIN*");
        System.out.println("*//////////////////////////////////////////////////////////////*");

    }

    public static void deleteDuplicatesAgain(Runner run) {
        run.setNext();
        System.out.println(run.deleteDuplicatesAgain(run.getList1()));
    }

    public static void deleteDuplicates(Runner run) {
        run.setNext();
        System.out.println(run.deleteDuplicates(run.getList1()));
    }

    private static void detectCycle(Runner run) {
        run.setNext();
        System.out.println(run.detectCycle(run.getList1()));
        run.setNodeNext(run.getList10(), run.getList1());
        System.out.println(run.detectCycle(run.getList1()));
        run.setNodeNext(run.getList10(), null);
        System.out.println(run.detectCycle(run.getList1()));
    }

    private static void hasCycle(Runner run) {
        run.setNext();
        System.out.println(run.hasCycle(run.getList1()));
        run.setNodeNext(run.getList10(), run.getList1());
        System.out.println(run.hasCycle(run.getList1()));
        run.setNodeNext(run.getList10(), null);
        System.out.println(run.hasCycle(run.getList1()));
    }
}
