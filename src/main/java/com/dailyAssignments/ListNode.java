package com.dailyAssignments;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}