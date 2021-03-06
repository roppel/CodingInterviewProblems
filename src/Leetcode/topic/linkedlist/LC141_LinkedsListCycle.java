package Leetcode.topic.linkedlist;


import Leetcode.common.ListNode;

public class LC141_LinkedsListCycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode slow =head.next;
        ListNode fast =head.next.next;


        while(slow != fast){

            if(fast==null || fast.next==null){
                return false;
            }

            slow =slow.next;
            fast =fast.next.next;
        }

        return true;
    }
}
