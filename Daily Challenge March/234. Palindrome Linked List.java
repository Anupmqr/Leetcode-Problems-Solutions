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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int l=0;
        while(temp!=null){
            l++;
            temp = temp.next;
        }

        int[] arr = new int[l];

        temp = head;
        for(int i=0; i<l; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }

        for(int i=0; i<l/2; i++){
            if(arr[i]!=arr[l-i-1])
                return false;
        }
    return true;
    }
}
