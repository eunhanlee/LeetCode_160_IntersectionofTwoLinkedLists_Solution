package org.example;


public class Solution {

    /**
     * Finds the intersection node of two linked lists.
     *
     * @param headA The head of the first linked list.
     * @param headB The head of the second linked list.
     * @return The intersection node if found, null otherwise.
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA;
    }
}
