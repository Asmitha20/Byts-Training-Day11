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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        return head;
        ListNode dumy=head;
        int count =1;
        while(dumy.next!=null){
            dumy=dumy.next;
            count++;
        }
        dumy.next=head;
        k=k%count;
        k=count-k;
        while(k-->0)
        dumy=dumy.next;
        head=dumy.next;
        dumy.next=null;
        return head;

        
    }
}
