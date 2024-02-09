package ru.m4nveru;

import ru.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        int remains = 0, sum = 0;
        if (l1.val + l2.val >= 10){
            l1.val = (l1.val + l2.val) % 10;
            remains++;
        } else {
            l1.val = l1.val + l2.val;
        }
        while (l1.next != null || l2.next != null || remains != 0){
            if (l1.next != null && l2.next != null){
                l1 = l1.next;
                l2 = l2.next;
                if (remains == 0){
                    sum = l1.val + l2.val;
                    if (sum >= 10){
                        l1.val = sum % 10;
                        remains++;
                    } else {
                        l1.val = sum;
                    }
                } else {
                    sum = l1.val + l2.val + remains;
                    if (sum >= 10){
                        l1.val = sum % 10;
                    } else {
                        l1.val = sum;
                        remains--;
                    }
                }
            } else if (l1.next != null){
                l1 = l1.next;
                if (remains == 0){
                    break;
                } else {
                    if (l1.val + remains >= 10){
                        l1.val = (l1.val + remains) % 10;
                    } else {
                        l1.val = l1.val + remains;
                        remains--;
                    }
                }
            } else if (l2.next != null){
                l2 = l2.next;
                if (remains == 0){
                    l1.next = new ListNode(l2.val);
                    l1 = l1.next;
                } else {
                    if (l2.val + remains >= 10){
                        l1.next = new ListNode((l2.val + remains) % 10);
                        l1 = l1.next;
                    } else {
                        l1.next = new ListNode(l2.val + remains);
                        l1 = l1.next;
                        remains--;
                    }
                }
            } else if (remains != 0){
                l1.next = new ListNode(remains);
                l1 = l1.next;
                remains--;
            }
        }
        return result;
    }
}
