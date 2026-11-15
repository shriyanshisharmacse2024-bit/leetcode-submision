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
    public ListNode partition(ListNode head, int x) {
        ListNode lesshead =  new ListNode(-1);
        ListNode lesstail = lesshead;

        ListNode  greathead = new ListNode(-1);
        ListNode greattail = greathead;
        ListNode temp  = head;

        while(temp != null){
            if(temp.val <  x){
                ListNode nodetoinseart = temp ;
                temp = temp.next;
                nodetoinseart.next = null;
                lesstail.next = nodetoinseart;
                lesstail = nodetoinseart;

            }else{
                  ListNode nodetoinseart = temp ;
                temp = temp.next;
                 nodetoinseart.next = null;
                 greattail.next = nodetoinseart;
                greattail = nodetoinseart;


            }
        }
        lesstail.next = greathead.next;
        greattail.next = null;
        lesshead = lesshead.next;
        return lesshead;
        
    }
}