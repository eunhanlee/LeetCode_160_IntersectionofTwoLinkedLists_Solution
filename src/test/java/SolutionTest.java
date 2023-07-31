import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.ListNode;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        assertEquals(null, solution.getIntersectionNode(null, null));

        ListNode listG1 = new ListNode(13);
        ListNode listG2 = new ListNode(14);
        listG1.next = listG2;

        assertEquals(null, solution.getIntersectionNode(null, listG1));

        ListNode listH1 = new ListNode(15);
        ListNode listH2 = new ListNode(16);
        listH1.next = listH2;

        ListNode listI1 = new ListNode(17);
        ListNode listI2 = new ListNode(18);
        listI1.next = listI2;

        assertEquals(null, solution.getIntersectionNode(listH1, listI1));

        ListNode listJ1 = new ListNode(19);
        ListNode listJ2 = new ListNode(20);
        ListNode listJ3 = new ListNode(21);

        listJ1.next = listJ2;
        listJ2.next = listJ3;

        ListNode listK1 = new ListNode(22);
        ListNode listK2 = new ListNode(23);

        listK1.next = listK2;
        listK2.next = listJ3;

        assertEquals(listJ3, solution.getIntersectionNode(listJ1, listK1));

        ListNode listL1 = new ListNode(24);
        ListNode listL2 = new ListNode(25);
        ListNode listL3 = new ListNode(26);

        listL1.next = listL2;
        listL2.next = listL3;

        ListNode listM1 = new ListNode(27);
        ListNode listM2 = new ListNode(28);

        listM1.next = listL2;
        listM2.next = listL3;

        assertEquals(listL2, solution.getIntersectionNode(listL1, listM1));


        System.out.println("All test cases passed.");
    }
}
