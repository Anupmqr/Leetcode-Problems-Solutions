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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        if(head == null) return null;
        int c=0;
        while(temp!=null){
            temp = temp.next;
            c++;
        }
        int x = c-n;
        temp = head;
        for(int i=1; i<x; i++){
            temp = temp.next;
        }
        
        if (x == 0) 
            head = head.next;
        else if (temp.next == null)
            return null;
        else
        temp.next = temp.next.next;

    return head;
    }
}
