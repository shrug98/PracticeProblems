//Remove duplicates from Sorted List

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head; 
        }
        ListNode nextNode = head.next; 
        ListNode currentNode = head; 
        while (nextNode != null){
            if(currentNode.val == nextNode.val){
                currentNode.next = nextNode.next;
                nextNode = nextNode.next;
            }
            else{
                currentNode = currentNode.next;
                nextNode = nextNode.next; 
            }
        }
        return head; 
    }
}
