package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();

        ListNode listA = new ListNode(1);
        listA.next=new ListNode(2);
        ListNode listB = new ListNode(3);
        listB.next=new ListNode(4);
        listB.next.next=new ListNode(5);

        ListNode c1 = new ListNode(6);
        ListNode c2 = new ListNode(7);
        ListNode c3 = new ListNode(8);

        listA.next.next=c1;
        listA.next.next.next=c2;
        listA.next.next.next.next=c3;
        listB.next.next.next=c1;
        listB.next.next.next.next=c2;
        listB.next.next.next.next.next=c3;

        System.out.println(tt.getIntersectionNode(listA,listB).val);
    }
}