/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode DeleteDuplicates(ListNode head)
    {
        if (head != null)
        {
            for (ListNode curr = head; curr != null; curr = curr.next)
            {
                while (curr.next != null && curr.next.val == curr.val)
                {
                    curr.next = curr.next.next;
                }
            }

            return head;
        }

        return null;
    }
}