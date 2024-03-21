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
    public ListNode reverseList(ListNode head) {
        ListNode node1=null, node2=null, curr = head;

        while(curr!=null){
            node2 = curr.next;
            curr.next = node1;
            node1 = curr;
            curr= node2;
        }

        head = node1;

        return head;
        
    }
}
