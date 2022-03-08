//reverse linked list 

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
        if(head == null || head.next == null){
            return head; 
        }
        ListNode n1 = head; 
        ListNode n2 = head.next;
        head.next = null;
        while(n1!=null && n2!=null){
            ListNode t = n2.next;
            n2.next = n1;
            n1 = n2; 
            n2 = t;
        }
        return n1; 
        
    }
}
