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
    public int getDecimalValue(ListNode head) {
        int n = length(head)-1;
        ListNode temp = head;
        int sum = 0;
        while(temp!=null)
        {
            sum += Math.pow(2,n)*temp.val;
            n--;
            temp = temp.next;
        }
        return sum;
    }
    
    public int length(ListNode head) {
        ListNode temp = head;
        int i = 0;
        while(temp!=null)
        {
            i++;
            temp = temp.next;
        }
        return i;
    }
}