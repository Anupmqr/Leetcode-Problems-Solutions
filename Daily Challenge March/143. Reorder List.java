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
    public void reorderList(ListNode head) {
        Deque<ListNode> deq = new LinkedList<>();
        ListNode temp = head.next;
        while(temp!=null){
            deq.offer(temp);
            temp = temp.next;
        }

        temp = head;
        while(!deq.isEmpty()){
            temp.next = deq.pollLast();
            temp = temp.next;
            if(!deq.isEmpty()){
            temp.next = deq.pollFirst();
            temp = temp.next;
            }
        }
        temp.next=null;
    }
}
