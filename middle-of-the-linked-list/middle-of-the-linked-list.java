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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        
        while (head.next != null) {
            ListNode next = head.next;
            
            if (next.next != null) {
                middle = middle.next;
                head = next.next;
            } else {
                middle = middle.next;
                head = next;
            }
        }
        
        return middle;
    }
}
// Time complexity - O(n)
// Space Complexity - O(1)