package week.two;

import java.util.List;

public class MiddleLinkedList {

    public static void main(String args[]){
        int[] list = new int[]{1,2,3,4,5};
        ListNode next = null;
        for(int i = 0; i < list.length; i++){
            next = new ListNode(list[list.length-1-i], next);
        }
        System.out.println(middleNode(next).val);
    }

    public static ListNode middleNode(ListNode head){
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        current = head;
        for(int i = 0; i < (count)/2; i++){
            current = current.next;
        }
        return current;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}