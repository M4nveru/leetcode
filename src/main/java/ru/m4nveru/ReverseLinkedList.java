package ru.m4nveru;

import ru.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pointer = head;
        int[] values = new int[5000];
        int it = 0;
        while (head != null){
            values[it] = head.val;
            it++;
            head = head.next;
        }
        if (it != 0){
            pointer.val = values[--it];
            it--;
            ListNode result = pointer;
            pointer = pointer.next;
            while (pointer!= null){
                pointer.val = values[it--];
                pointer = pointer.next;
            }
            return result;
        }
        return head;
    }
}
