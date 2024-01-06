package com.dailyAssignments;


public class Main {
    public static void main(String[] args) {
        int totalList1 = getTotalList(l1);
        int totalList2 = getTotalList(l2);
        int sum = totalList1 + totalList2;
        System.out.println(placeNumbersIntoListNode(sum));
    }

    static int getTotalList(ListNode listNode) {
        int total = 0;
        int multiplier = 1;
        while (listNode != null) {
            total += listNode.val * multiplier;
            multiplier *= 10;
            listNode = listNode.next;
        }
        return total;
    }

    static ListNode placeNumbersIntoListNode(int number) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (number > 0) {
            int digit = number % 10;
            current.next = new ListNode(digit);
            current = current.next;
            number /= 10;
        }
        return dummy.next;
    }
}